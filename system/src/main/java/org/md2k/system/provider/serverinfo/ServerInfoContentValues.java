/*
 * This source is part of the
 *      _____  ___   ____
 *  __ / / _ \/ _ | / __/___  _______ _
 * / // / , _/ __ |/ _/_/ _ \/ __/ _ `/
 * \___/_/|_/_/ |_/_/ (_)___/_/  \_, /
 *                              /___/
 * repository.
 *
 * Copyright (C) 2012-2017 Benoit 'BoD' Lubek (BoD@JRAF.org)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.md2k.system.provider.serverinfo;

// @formatter:off
import java.util.Date;

import android.content.Context;
import android.content.ContentResolver;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import org.md2k.system.provider.base.AbstractContentValues;

/**
 * Content values wrapper for the {@code server_info} table.
 */
@SuppressWarnings({"ConstantConditions", "unused"})
public class ServerInfoContentValues extends AbstractContentValues<ServerInfoContentValues> {
    @Override
    protected Uri baseUri() {
        return ServerInfoColumns.CONTENT_URI;
    }

    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param contentResolver The content resolver to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(ContentResolver contentResolver, @Nullable ServerInfoSelection where) {
        return contentResolver.update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param context The context to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(Context context, @Nullable ServerInfoSelection where) {
        return context.getContentResolver().update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    public ServerInfoContentValues putServerAddress(@Nullable String value) {
        mContentValues.put(ServerInfoColumns.SERVER_ADDRESS, value);
        return this;
    }

    public ServerInfoContentValues putServerAddressNull() {
        mContentValues.putNull(ServerInfoColumns.SERVER_ADDRESS);
        return this;
    }

    public ServerInfoContentValues putUsername(@Nullable String value) {
        mContentValues.put(ServerInfoColumns.USERNAME, value);
        return this;
    }

    public ServerInfoContentValues putUsernameNull() {
        mContentValues.putNull(ServerInfoColumns.USERNAME);
        return this;
    }

    public ServerInfoContentValues putUuid(@Nullable String value) {
        mContentValues.put(ServerInfoColumns.UUID, value);
        return this;
    }

    public ServerInfoContentValues putUuidNull() {
        mContentValues.putNull(ServerInfoColumns.UUID);
        return this;
    }

    public ServerInfoContentValues putPasswordHash(@Nullable String value) {
        mContentValues.put(ServerInfoColumns.PASSWORD_HASH, value);
        return this;
    }

    public ServerInfoContentValues putPasswordHashNull() {
        mContentValues.putNull(ServerInfoColumns.PASSWORD_HASH);
        return this;
    }

    public ServerInfoContentValues putToken(@Nullable String value) {
        mContentValues.put(ServerInfoColumns.TOKEN, value);
        return this;
    }

    public ServerInfoContentValues putTokenNull() {
        mContentValues.putNull(ServerInfoColumns.TOKEN);
        return this;
    }

    public ServerInfoContentValues putFileName(@Nullable String value) {
        mContentValues.put(ServerInfoColumns.FILE_NAME, value);
        return this;
    }

    public ServerInfoContentValues putFileNameNull() {
        mContentValues.putNull(ServerInfoColumns.FILE_NAME);
        return this;
    }

    public ServerInfoContentValues putCurrentVersion(@Nullable String value) {
        mContentValues.put(ServerInfoColumns.CURRENT_VERSION, value);
        return this;
    }

    public ServerInfoContentValues putCurrentVersionNull() {
        mContentValues.putNull(ServerInfoColumns.CURRENT_VERSION);
        return this;
    }

    public ServerInfoContentValues putLatestVersion(@Nullable String value) {
        mContentValues.put(ServerInfoColumns.LATEST_VERSION, value);
        return this;
    }

    public ServerInfoContentValues putLatestVersionNull() {
        mContentValues.putNull(ServerInfoColumns.LATEST_VERSION);
        return this;
    }
}
