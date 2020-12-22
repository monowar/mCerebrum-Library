package org.md2k.mcerebrum.core.access.studyinfo;

// @formatter:off

import android.content.Context;
import android.content.ContentResolver;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.md2k.mcerebrum.core.access.base.AbstractContentValues;

/**
 * Content values wrapper for the {@code study_info} table.
 */
@SuppressWarnings({"ConstantConditions", "unused"})
public class StudyInfoContentValues extends AbstractContentValues<StudyInfoContentValues> {
    @Override
    protected Uri baseUri() {
        return StudyInfoColumns.CONTENT_URI;
    }

    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param contentResolver The content resolver to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(ContentResolver contentResolver, @Nullable StudyInfoSelection where) {
        return contentResolver.update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param context The context to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(Context context, @Nullable StudyInfoSelection where) {
        return context.getContentResolver().update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    public StudyInfoContentValues putSid(@Nullable String value) {
        mContentValues.put(StudyInfoColumns.SID, value);
        return this;
    }

    public StudyInfoContentValues putSidNull() {
        mContentValues.putNull(StudyInfoColumns.SID);
        return this;
    }

    public StudyInfoContentValues putType(@Nullable String value) {
        mContentValues.put(StudyInfoColumns.TYPE, value);
        return this;
    }

    public StudyInfoContentValues putTypeNull() {
        mContentValues.putNull(StudyInfoColumns.TYPE);
        return this;
    }

    public StudyInfoContentValues putTitle(@Nullable String value) {
        mContentValues.put(StudyInfoColumns.TITLE, value);
        return this;
    }

    public StudyInfoContentValues putTitleNull() {
        mContentValues.putNull(StudyInfoColumns.TITLE);
        return this;
    }

    public StudyInfoContentValues putSummary(@Nullable String value) {
        mContentValues.put(StudyInfoColumns.SUMMARY, value);
        return this;
    }

    public StudyInfoContentValues putSummaryNull() {
        mContentValues.putNull(StudyInfoColumns.SUMMARY);
        return this;
    }

    public StudyInfoContentValues putDescription(@Nullable String value) {
        mContentValues.put(StudyInfoColumns.DESCRIPTION, value);
        return this;
    }

    public StudyInfoContentValues putDescriptionNull() {
        mContentValues.putNull(StudyInfoColumns.DESCRIPTION);
        return this;
    }

    public StudyInfoContentValues putVersion(@Nullable String value) {
        mContentValues.put(StudyInfoColumns.VERSION, value);
        return this;
    }

    public StudyInfoContentValues putVersionNull() {
        mContentValues.putNull(StudyInfoColumns.VERSION);
        return this;
    }

    public StudyInfoContentValues putIcon(@Nullable String value) {
        mContentValues.put(StudyInfoColumns.ICON, value);
        return this;
    }

    public StudyInfoContentValues putIconNull() {
        mContentValues.putNull(StudyInfoColumns.ICON);
        return this;
    }

    public StudyInfoContentValues putCoverImage(@Nullable String value) {
        mContentValues.put(StudyInfoColumns.COVER_IMAGE, value);
        return this;
    }

    public StudyInfoContentValues putCoverImageNull() {
        mContentValues.putNull(StudyInfoColumns.COVER_IMAGE);
        return this;
    }

    public StudyInfoContentValues putStartAtBoot(@Nullable Boolean value) {
        mContentValues.put(StudyInfoColumns.START_AT_BOOT, value);
        return this;
    }

    public StudyInfoContentValues putStartAtBootNull() {
        mContentValues.putNull(StudyInfoColumns.START_AT_BOOT);
        return this;
    }

    public StudyInfoContentValues putStarted(@Nullable Boolean value) {
        mContentValues.put(StudyInfoColumns.STARTED, value);
        return this;
    }

    public StudyInfoContentValues putStartedNull() {
        mContentValues.putNull(StudyInfoColumns.STARTED);
        return this;
    }
}
