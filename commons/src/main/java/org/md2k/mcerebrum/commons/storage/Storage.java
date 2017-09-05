package org.md2k.mcerebrum.commons.storage;
/*
 * Copyright (c) 2016, The University of Memphis, MD2K Center
 * - Syed Monowar Hossain <monowar.hossain@gmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 * list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;

import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.ZipUtils;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Storage {
    private Storage() {
    }
    public static String getRootDirectory(Context context, StorageType storageType) {
        switch (storageType) {
            case SDCARD_APPLICATION:
                return context.getFilesDir().getAbsolutePath();
            case SDCARD_EXTERNAL:
                return getRootDirectorySDCardExternal(context);
            case SDCARD_INTERNAL:
                return getRootDirectorySDCardInternal();
            case SDCARD_EXTERNAL_PREFERRED:
                return getRootDirectoryPreferred(context);
        }
        return null;
    }
    private static String getRootDirectoryPreferred(Context context){
        String rootDirectory = getRootDirectorySDCardExternal(context);
        if(rootDirectory==null)
            rootDirectory=getRootDirectorySDCardInternal();
        return rootDirectory;
    }

    private static String getRootDirectorySDCardExternal(Context context) {
        String strSDCardPath = System.getenv("SECONDARY_STORAGE");
        File[] externalFilesDirs = context.getExternalFilesDirs(null);
        for (File externalFilesDir : externalFilesDirs) {
            if (externalFilesDir == null) continue;
            if (strSDCardPath == null) return null;
            if (externalFilesDir.getAbsolutePath().contains(strSDCardPath))
                return externalFilesDir.getAbsolutePath();
        }
        return null;
    }

    private static String getRootDirectorySDCardInternal() {
        String directory = null;
        if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
            directory = Environment.getExternalStorageDirectory().getAbsolutePath();
        }
        return directory;
    }

    public static boolean isExist(Context context, StorageType storageType) {
        if(storageType==StorageType.ASSET)
            return context.getAssets() != null;
        else {
            return getRootDirectory(context, storageType)!=null;
        }
    }

    public static long getSpaceTotal(Context context, StorageType storageType) {
        if(!isExist(context, storageType)) return -1;
        return new StatFs(getRootDirectory(context, storageType)).getTotalBytes();
    }

    public static long getSpaceFree(Context context, StorageType storageType) {
        if(!isExist(context, storageType)) return -1;
        return new StatFs(getRootDirectory(context, storageType)).getAvailableBytes();
    }

    public static long getSpaceUsed(Context context, StorageType storageType) {
        if(!isExist(context, storageType)) return -1;
        return getSpaceTotal(context, storageType)-getSpaceFree(context, storageType);
    }

    public static boolean copy(String sourcePath, String destinationPath) {
        return FileUtils.copyFile(sourcePath, destinationPath);
    }

    public static boolean copyFromAsset(Context context, String assetFilePath, String destinationFilePath) throws IOException {
        InputStream in = context.getAssets().open(assetFilePath);
        if (!FileUtils.createOrExistsFile(destinationFilePath))
            throw new IOException("Failed to create file");
        FileOutputStream out = new FileOutputStream(destinationFilePath);
        if (in == null) return false;
        byte[] buffer = new byte[1024];
        int read;
        while ((read = in.read(buffer)) != -1) {
            out.write(buffer, 0, read);
        }
        return true;
    }

    public static boolean unzip(String zipFilePath, String destDirPath) {
        return ZipUtils.unzipFile(zipFilePath, destDirPath);
    }

    public static boolean deleteDir(String dirPath) {
        return FileUtils.deleteDir(dirPath);
    }

    public static boolean deleteFile(String filePath) {
        return FileUtils.deleteFile(filePath);
    }

    public static <T> T readJson(String filePath, Class<T> classType) throws FileNotFoundException {
        T data = null;
        BufferedReader reader = null;
        try {
            InputStream in = new FileInputStream(filePath);
            reader = new BufferedReader(new InputStreamReader(in));
            Gson gson = new Gson();
            data = gson.fromJson(reader, classType);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException ignored) {
                }
            }
        }
        return data;
    }

    public static <T> ArrayList<T> readJsonArrayList(String filePath, Class<T> classType) throws FileNotFoundException {
        ArrayList<T> data = null;
        BufferedReader reader = null;
        try {
            InputStream in = new FileInputStream(filePath);
            reader = new BufferedReader(new InputStreamReader(in));
            Gson gson = new Gson();
            data = gson.fromJson(reader, new ListOfSomething<>(classType));
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException ignored) {
                }
            }
        }
        return data;
    }

    private static class ListOfSomething<X> implements ParameterizedType {

        private Class<?> wrapped;

        ListOfSomething(Class<X> wrapped) {
            this.wrapped = wrapped;
        }

        public java.lang.reflect.Type[] getActualTypeArguments() {
            return new java.lang.reflect.Type[]{wrapped};
        }

        public java.lang.reflect.Type getRawType() {
            return List.class;
        }

        public java.lang.reflect.Type getOwnerType() {
            return null;
        }
    }

    public static <T> boolean writeJson(String filePath, T data) throws IOException {
        boolean result = true;
        FileWriter writer = null;
        try {
            if (!FileUtils.createOrExistsFile(filePath)) return false;
            Gson gson = new Gson();
            String json = gson.toJson(data);
            writer = new FileWriter(filePath);
            writer.write(json);
        } finally {
            try {
                if (writer != null)
                    writer.close();
            } catch (IOException e) {
                result = false;
            }
        }
        return result;
    }

    public static <T> boolean writeJsonArray(String filePath, ArrayList<T> data) throws IOException {
        boolean result = true;
        FileWriter writer = null;
        try {
            if (!FileUtils.createOrExistsFile(filePath)) return false;
            Gson gson = new Gson();
            String json = gson.toJson(data);
            writer = new FileWriter(filePath);
            writer.write(json);
        } finally {
            try {
                if (writer != null)
                    writer.close();
            } catch (IOException e) {
                result = false;
            }
        }
        return result;
    }

}