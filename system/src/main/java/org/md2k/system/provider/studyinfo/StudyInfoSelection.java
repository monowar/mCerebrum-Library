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
package org.md2k.system.provider.studyinfo;

// @formatter:off
import java.util.Date;

import android.content.Context;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.support.v4.content.CursorLoader;

import org.md2k.system.provider.base.AbstractSelection;

/**
 * Selection for the {@code study_info} table.
 */
@SuppressWarnings({"unused", "WeakerAccess", "Recycle"})
public class StudyInfoSelection extends AbstractSelection<StudyInfoSelection> {
    @Override
    protected Uri baseUri() {
        return StudyInfoColumns.CONTENT_URI;
    }

    /**
     * Query the given content resolver using this selection.
     *
     * @param contentResolver The content resolver to query.
     * @param projection A list of which columns to return. Passing null will return all columns, which is inefficient.
     * @return A {@code StudyInfoCursor} object, which is positioned before the first entry, or null.
     */
    public StudyInfoCursor query(ContentResolver contentResolver, String[] projection) {
        Cursor cursor = contentResolver.query(uri(), projection, sel(), args(), order());
        if (cursor == null) return null;
        return new StudyInfoCursor(cursor);
    }

    /**
     * Equivalent of calling {@code query(contentResolver, null)}.
     */
    public StudyInfoCursor query(ContentResolver contentResolver) {
        return query(contentResolver, null);
    }

    /**
     * Query the given content resolver using this selection.
     *
     * @param context The context to use for the query.
     * @param projection A list of which columns to return. Passing null will return all columns, which is inefficient.
     * @return A {@code StudyInfoCursor} object, which is positioned before the first entry, or null.
     */
    public StudyInfoCursor query(Context context, String[] projection) {
        Cursor cursor = context.getContentResolver().query(uri(), projection, sel(), args(), order());
        if (cursor == null) return null;
        return new StudyInfoCursor(cursor);
    }

    /**
     * Equivalent of calling {@code query(context, null)}.
     */
    public StudyInfoCursor query(Context context) {
        return query(context, null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public CursorLoader getCursorLoader(Context context, String[] projection) {
        return new CursorLoader(context, uri(), projection, sel(), args(), order()) {
            @Override
            public Cursor loadInBackground() {
                return new StudyInfoCursor(super.loadInBackground());
            }
        };
    }


    public StudyInfoSelection id(long... value) {
        addEquals("study_info." + StudyInfoColumns._ID, toObjectArray(value));
        return this;
    }

    public StudyInfoSelection idNot(long... value) {
        addNotEquals("study_info." + StudyInfoColumns._ID, toObjectArray(value));
        return this;
    }

    public StudyInfoSelection orderById(boolean desc) {
        orderBy("study_info." + StudyInfoColumns._ID, desc);
        return this;
    }

    public StudyInfoSelection orderById() {
        return orderById(false);
    }

    public StudyInfoSelection sid(String... value) {
        addEquals(StudyInfoColumns.SID, value);
        return this;
    }

    public StudyInfoSelection sidNot(String... value) {
        addNotEquals(StudyInfoColumns.SID, value);
        return this;
    }

    public StudyInfoSelection sidLike(String... value) {
        addLike(StudyInfoColumns.SID, value);
        return this;
    }

    public StudyInfoSelection sidContains(String... value) {
        addContains(StudyInfoColumns.SID, value);
        return this;
    }

    public StudyInfoSelection sidStartsWith(String... value) {
        addStartsWith(StudyInfoColumns.SID, value);
        return this;
    }

    public StudyInfoSelection sidEndsWith(String... value) {
        addEndsWith(StudyInfoColumns.SID, value);
        return this;
    }

    public StudyInfoSelection orderBySid(boolean desc) {
        orderBy(StudyInfoColumns.SID, desc);
        return this;
    }

    public StudyInfoSelection orderBySid() {
        orderBy(StudyInfoColumns.SID, false);
        return this;
    }

    public StudyInfoSelection type(String... value) {
        addEquals(StudyInfoColumns.TYPE, value);
        return this;
    }

    public StudyInfoSelection typeNot(String... value) {
        addNotEquals(StudyInfoColumns.TYPE, value);
        return this;
    }

    public StudyInfoSelection typeLike(String... value) {
        addLike(StudyInfoColumns.TYPE, value);
        return this;
    }

    public StudyInfoSelection typeContains(String... value) {
        addContains(StudyInfoColumns.TYPE, value);
        return this;
    }

    public StudyInfoSelection typeStartsWith(String... value) {
        addStartsWith(StudyInfoColumns.TYPE, value);
        return this;
    }

    public StudyInfoSelection typeEndsWith(String... value) {
        addEndsWith(StudyInfoColumns.TYPE, value);
        return this;
    }

    public StudyInfoSelection orderByType(boolean desc) {
        orderBy(StudyInfoColumns.TYPE, desc);
        return this;
    }

    public StudyInfoSelection orderByType() {
        orderBy(StudyInfoColumns.TYPE, false);
        return this;
    }

    public StudyInfoSelection title(String... value) {
        addEquals(StudyInfoColumns.TITLE, value);
        return this;
    }

    public StudyInfoSelection titleNot(String... value) {
        addNotEquals(StudyInfoColumns.TITLE, value);
        return this;
    }

    public StudyInfoSelection titleLike(String... value) {
        addLike(StudyInfoColumns.TITLE, value);
        return this;
    }

    public StudyInfoSelection titleContains(String... value) {
        addContains(StudyInfoColumns.TITLE, value);
        return this;
    }

    public StudyInfoSelection titleStartsWith(String... value) {
        addStartsWith(StudyInfoColumns.TITLE, value);
        return this;
    }

    public StudyInfoSelection titleEndsWith(String... value) {
        addEndsWith(StudyInfoColumns.TITLE, value);
        return this;
    }

    public StudyInfoSelection orderByTitle(boolean desc) {
        orderBy(StudyInfoColumns.TITLE, desc);
        return this;
    }

    public StudyInfoSelection orderByTitle() {
        orderBy(StudyInfoColumns.TITLE, false);
        return this;
    }

    public StudyInfoSelection summary(String... value) {
        addEquals(StudyInfoColumns.SUMMARY, value);
        return this;
    }

    public StudyInfoSelection summaryNot(String... value) {
        addNotEquals(StudyInfoColumns.SUMMARY, value);
        return this;
    }

    public StudyInfoSelection summaryLike(String... value) {
        addLike(StudyInfoColumns.SUMMARY, value);
        return this;
    }

    public StudyInfoSelection summaryContains(String... value) {
        addContains(StudyInfoColumns.SUMMARY, value);
        return this;
    }

    public StudyInfoSelection summaryStartsWith(String... value) {
        addStartsWith(StudyInfoColumns.SUMMARY, value);
        return this;
    }

    public StudyInfoSelection summaryEndsWith(String... value) {
        addEndsWith(StudyInfoColumns.SUMMARY, value);
        return this;
    }

    public StudyInfoSelection orderBySummary(boolean desc) {
        orderBy(StudyInfoColumns.SUMMARY, desc);
        return this;
    }

    public StudyInfoSelection orderBySummary() {
        orderBy(StudyInfoColumns.SUMMARY, false);
        return this;
    }

    public StudyInfoSelection description(String... value) {
        addEquals(StudyInfoColumns.DESCRIPTION, value);
        return this;
    }

    public StudyInfoSelection descriptionNot(String... value) {
        addNotEquals(StudyInfoColumns.DESCRIPTION, value);
        return this;
    }

    public StudyInfoSelection descriptionLike(String... value) {
        addLike(StudyInfoColumns.DESCRIPTION, value);
        return this;
    }

    public StudyInfoSelection descriptionContains(String... value) {
        addContains(StudyInfoColumns.DESCRIPTION, value);
        return this;
    }

    public StudyInfoSelection descriptionStartsWith(String... value) {
        addStartsWith(StudyInfoColumns.DESCRIPTION, value);
        return this;
    }

    public StudyInfoSelection descriptionEndsWith(String... value) {
        addEndsWith(StudyInfoColumns.DESCRIPTION, value);
        return this;
    }

    public StudyInfoSelection orderByDescription(boolean desc) {
        orderBy(StudyInfoColumns.DESCRIPTION, desc);
        return this;
    }

    public StudyInfoSelection orderByDescription() {
        orderBy(StudyInfoColumns.DESCRIPTION, false);
        return this;
    }

    public StudyInfoSelection version(String... value) {
        addEquals(StudyInfoColumns.VERSION, value);
        return this;
    }

    public StudyInfoSelection versionNot(String... value) {
        addNotEquals(StudyInfoColumns.VERSION, value);
        return this;
    }

    public StudyInfoSelection versionLike(String... value) {
        addLike(StudyInfoColumns.VERSION, value);
        return this;
    }

    public StudyInfoSelection versionContains(String... value) {
        addContains(StudyInfoColumns.VERSION, value);
        return this;
    }

    public StudyInfoSelection versionStartsWith(String... value) {
        addStartsWith(StudyInfoColumns.VERSION, value);
        return this;
    }

    public StudyInfoSelection versionEndsWith(String... value) {
        addEndsWith(StudyInfoColumns.VERSION, value);
        return this;
    }

    public StudyInfoSelection orderByVersion(boolean desc) {
        orderBy(StudyInfoColumns.VERSION, desc);
        return this;
    }

    public StudyInfoSelection orderByVersion() {
        orderBy(StudyInfoColumns.VERSION, false);
        return this;
    }

    public StudyInfoSelection icon(String... value) {
        addEquals(StudyInfoColumns.ICON, value);
        return this;
    }

    public StudyInfoSelection iconNot(String... value) {
        addNotEquals(StudyInfoColumns.ICON, value);
        return this;
    }

    public StudyInfoSelection iconLike(String... value) {
        addLike(StudyInfoColumns.ICON, value);
        return this;
    }

    public StudyInfoSelection iconContains(String... value) {
        addContains(StudyInfoColumns.ICON, value);
        return this;
    }

    public StudyInfoSelection iconStartsWith(String... value) {
        addStartsWith(StudyInfoColumns.ICON, value);
        return this;
    }

    public StudyInfoSelection iconEndsWith(String... value) {
        addEndsWith(StudyInfoColumns.ICON, value);
        return this;
    }

    public StudyInfoSelection orderByIcon(boolean desc) {
        orderBy(StudyInfoColumns.ICON, desc);
        return this;
    }

    public StudyInfoSelection orderByIcon() {
        orderBy(StudyInfoColumns.ICON, false);
        return this;
    }

    public StudyInfoSelection coverImage(String... value) {
        addEquals(StudyInfoColumns.COVER_IMAGE, value);
        return this;
    }

    public StudyInfoSelection coverImageNot(String... value) {
        addNotEquals(StudyInfoColumns.COVER_IMAGE, value);
        return this;
    }

    public StudyInfoSelection coverImageLike(String... value) {
        addLike(StudyInfoColumns.COVER_IMAGE, value);
        return this;
    }

    public StudyInfoSelection coverImageContains(String... value) {
        addContains(StudyInfoColumns.COVER_IMAGE, value);
        return this;
    }

    public StudyInfoSelection coverImageStartsWith(String... value) {
        addStartsWith(StudyInfoColumns.COVER_IMAGE, value);
        return this;
    }

    public StudyInfoSelection coverImageEndsWith(String... value) {
        addEndsWith(StudyInfoColumns.COVER_IMAGE, value);
        return this;
    }

    public StudyInfoSelection orderByCoverImage(boolean desc) {
        orderBy(StudyInfoColumns.COVER_IMAGE, desc);
        return this;
    }

    public StudyInfoSelection orderByCoverImage() {
        orderBy(StudyInfoColumns.COVER_IMAGE, false);
        return this;
    }

    public StudyInfoSelection startAtBoot(Boolean value) {
        addEquals(StudyInfoColumns.START_AT_BOOT, toObjectArray(value));
        return this;
    }

    public StudyInfoSelection orderByStartAtBoot(boolean desc) {
        orderBy(StudyInfoColumns.START_AT_BOOT, desc);
        return this;
    }

    public StudyInfoSelection orderByStartAtBoot() {
        orderBy(StudyInfoColumns.START_AT_BOOT, false);
        return this;
    }

    public StudyInfoSelection started(Boolean value) {
        addEquals(StudyInfoColumns.STARTED, toObjectArray(value));
        return this;
    }

    public StudyInfoSelection orderByStarted(boolean desc) {
        orderBy(StudyInfoColumns.STARTED, desc);
        return this;
    }

    public StudyInfoSelection orderByStarted() {
        orderBy(StudyInfoColumns.STARTED, false);
        return this;
    }
}
