package org.md2k.mcerebrum.core.access.appinfo;

// @formatter:off

import android.content.Context;
import android.content.ContentResolver;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.md2k.mcerebrum.core.access.base.AbstractContentValues;

/**
 * Content values wrapper for the {@code app_info} table.
 */
@SuppressWarnings({"ConstantConditions", "unused"})
public class AppInfoContentValues extends AbstractContentValues<AppInfoContentValues> {
    @Override
    protected Uri baseUri() {
        return AppInfoColumns.CONTENT_URI;
    }

    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param contentResolver The content resolver to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(ContentResolver contentResolver, @Nullable AppInfoSelection where) {
        return contentResolver.update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    /**
     * Update row(s) using the values stored by this object and the given selection.
     *
     * @param context The context to use.
     * @param where The selection to use (can be {@code null}).
     */
    public int update(Context context, @Nullable AppInfoSelection where) {
        return context.getContentResolver().update(uri(), values(), where == null ? null : where.sel(), where == null ? null : where.args());
    }

    public AppInfoContentValues putPackageName(@Nullable String value) {
        mContentValues.put(AppInfoColumns.PACKAGE_NAME, value);
        return this;
    }

    public AppInfoContentValues putPackageNameNull() {
        mContentValues.putNull(AppInfoColumns.PACKAGE_NAME);
        return this;
    }

    /**
     * MCEREBRUM, STUDY, DATAKIT,any other string
     */
    public AppInfoContentValues putType(@Nullable String value) {
        mContentValues.put(AppInfoColumns.TYPE, value);
        return this;
    }

    public AppInfoContentValues putTypeNull() {
        mContentValues.putNull(AppInfoColumns.TYPE);
        return this;
    }

    public AppInfoContentValues putTitle(@Nullable String value) {
        mContentValues.put(AppInfoColumns.TITLE, value);
        return this;
    }

    public AppInfoContentValues putTitleNull() {
        mContentValues.putNull(AppInfoColumns.TITLE);
        return this;
    }

    public AppInfoContentValues putSummary(@Nullable String value) {
        mContentValues.put(AppInfoColumns.SUMMARY, value);
        return this;
    }

    public AppInfoContentValues putSummaryNull() {
        mContentValues.putNull(AppInfoColumns.SUMMARY);
        return this;
    }

    public AppInfoContentValues putDescription(@Nullable String value) {
        mContentValues.put(AppInfoColumns.DESCRIPTION, value);
        return this;
    }

    public AppInfoContentValues putDescriptionNull() {
        mContentValues.putNull(AppInfoColumns.DESCRIPTION);
        return this;
    }

    public AppInfoContentValues putUseInStudy(@Nullable Boolean value) {
        mContentValues.put(AppInfoColumns.USE_IN_STUDY, value);
        return this;
    }

    public AppInfoContentValues putUseInStudyNull() {
        mContentValues.putNull(AppInfoColumns.USE_IN_STUDY);
        return this;
    }

    /**
     * not in use, required, optional
     */
    public AppInfoContentValues putUseAs(@Nullable String value) {
        mContentValues.put(AppInfoColumns.USE_AS, value);
        return this;
    }

    public AppInfoContentValues putUseAsNull() {
        mContentValues.putNull(AppInfoColumns.USE_AS);
        return this;
    }

    public AppInfoContentValues putInstalled(@Nullable Boolean value) {
        mContentValues.put(AppInfoColumns.INSTALLED, value);
        return this;
    }

    public AppInfoContentValues putInstalledNull() {
        mContentValues.putNull(AppInfoColumns.INSTALLED);
        return this;
    }

    public AppInfoContentValues putDownloadLink(@Nullable String value) {
        mContentValues.put(AppInfoColumns.DOWNLOAD_LINK, value);
        return this;
    }

    public AppInfoContentValues putDownloadLinkNull() {
        mContentValues.putNull(AppInfoColumns.DOWNLOAD_LINK);
        return this;
    }

    /**
     * NOTIFY, AUTO, MANUAL
     */
    public AppInfoContentValues putUpdates(@Nullable String value) {
        mContentValues.put(AppInfoColumns.UPDATES, value);
        return this;
    }

    public AppInfoContentValues putUpdatesNull() {
        mContentValues.putNull(AppInfoColumns.UPDATES);
        return this;
    }

    public AppInfoContentValues putCurrentVersion(@Nullable String value) {
        mContentValues.put(AppInfoColumns.CURRENT_VERSION, value);
        return this;
    }

    public AppInfoContentValues putCurrentVersionNull() {
        mContentValues.putNull(AppInfoColumns.CURRENT_VERSION);
        return this;
    }

    public AppInfoContentValues putLatestVersion(@Nullable String value) {
        mContentValues.put(AppInfoColumns.LATEST_VERSION, value);
        return this;
    }

    public AppInfoContentValues putLatestVersionNull() {
        mContentValues.putNull(AppInfoColumns.LATEST_VERSION);
        return this;
    }

    public AppInfoContentValues putExpectedVersion(@Nullable String value) {
        mContentValues.put(AppInfoColumns.EXPECTED_VERSION, value);
        return this;
    }

    public AppInfoContentValues putExpectedVersionNull() {
        mContentValues.putNull(AppInfoColumns.EXPECTED_VERSION);
        return this;
    }

    public AppInfoContentValues putIcon(@Nullable String value) {
        mContentValues.put(AppInfoColumns.ICON, value);
        return this;
    }

    public AppInfoContentValues putIconNull() {
        mContentValues.putNull(AppInfoColumns.ICON);
        return this;
    }

    public AppInfoContentValues putMcerebrumSupported(@Nullable Boolean value) {
        mContentValues.put(AppInfoColumns.MCEREBRUM_SUPPORTED, value);
        return this;
    }

    public AppInfoContentValues putMcerebrumSupportedNull() {
        mContentValues.putNull(AppInfoColumns.MCEREBRUM_SUPPORTED);
        return this;
    }

    public AppInfoContentValues putFuncInitialize(@Nullable String value) {
        mContentValues.put(AppInfoColumns.FUNC_INITIALIZE, value);
        return this;
    }

    public AppInfoContentValues putFuncInitializeNull() {
        mContentValues.putNull(AppInfoColumns.FUNC_INITIALIZE);
        return this;
    }

    public AppInfoContentValues putInitialized(@Nullable Boolean value) {
        mContentValues.put(AppInfoColumns.INITIALIZED, value);
        return this;
    }

    public AppInfoContentValues putInitializedNull() {
        mContentValues.putNull(AppInfoColumns.INITIALIZED);
        return this;
    }

    public AppInfoContentValues putFuncUpdateInfo(@Nullable String value) {
        mContentValues.put(AppInfoColumns.FUNC_UPDATE_INFO, value);
        return this;
    }

    public AppInfoContentValues putFuncUpdateInfoNull() {
        mContentValues.putNull(AppInfoColumns.FUNC_UPDATE_INFO);
        return this;
    }

    public AppInfoContentValues putFuncConfigure(@Nullable String value) {
        mContentValues.put(AppInfoColumns.FUNC_CONFIGURE, value);
        return this;
    }

    public AppInfoContentValues putFuncConfigureNull() {
        mContentValues.putNull(AppInfoColumns.FUNC_CONFIGURE);
        return this;
    }

    public AppInfoContentValues putConfigured(@Nullable Boolean value) {
        mContentValues.put(AppInfoColumns.CONFIGURED, value);
        return this;
    }

    public AppInfoContentValues putConfiguredNull() {
        mContentValues.putNull(AppInfoColumns.CONFIGURED);
        return this;
    }

    public AppInfoContentValues putConfigureMatch(@Nullable Boolean value) {
        mContentValues.put(AppInfoColumns.CONFIGURE_MATCH, value);
        return this;
    }

    public AppInfoContentValues putConfigureMatchNull() {
        mContentValues.putNull(AppInfoColumns.CONFIGURE_MATCH);
        return this;
    }

    public AppInfoContentValues putFuncPermission(@Nullable String value) {
        mContentValues.put(AppInfoColumns.FUNC_PERMISSION, value);
        return this;
    }

    public AppInfoContentValues putFuncPermissionNull() {
        mContentValues.putNull(AppInfoColumns.FUNC_PERMISSION);
        return this;
    }

    public AppInfoContentValues putPermissionOk(@Nullable Boolean value) {
        mContentValues.put(AppInfoColumns.PERMISSION_OK, value);
        return this;
    }

    public AppInfoContentValues putPermissionOkNull() {
        mContentValues.putNull(AppInfoColumns.PERMISSION_OK);
        return this;
    }

    public AppInfoContentValues putFuncBackground(@Nullable String value) {
        mContentValues.put(AppInfoColumns.FUNC_BACKGROUND, value);
        return this;
    }

    public AppInfoContentValues putFuncBackgroundNull() {
        mContentValues.putNull(AppInfoColumns.FUNC_BACKGROUND);
        return this;
    }

    public AppInfoContentValues putBackgroundRunningTime(@Nullable Boolean value) {
        mContentValues.put(AppInfoColumns.BACKGROUND_RUNNING_TIME, value);
        return this;
    }

    public AppInfoContentValues putBackgroundRunningTimeNull() {
        mContentValues.putNull(AppInfoColumns.BACKGROUND_RUNNING_TIME);
        return this;
    }

    public AppInfoContentValues putIsBackgroundRunning(@Nullable Boolean value) {
        mContentValues.put(AppInfoColumns.IS_BACKGROUND_RUNNING, value);
        return this;
    }

    public AppInfoContentValues putIsBackgroundRunningNull() {
        mContentValues.putNull(AppInfoColumns.IS_BACKGROUND_RUNNING);
        return this;
    }

    public AppInfoContentValues putFuncReport(@Nullable String value) {
        mContentValues.put(AppInfoColumns.FUNC_REPORT, value);
        return this;
    }

    public AppInfoContentValues putFuncReportNull() {
        mContentValues.putNull(AppInfoColumns.FUNC_REPORT);
        return this;
    }

    public AppInfoContentValues putFuncClear(@Nullable String value) {
        mContentValues.put(AppInfoColumns.FUNC_CLEAR, value);
        return this;
    }

    public AppInfoContentValues putFuncClearNull() {
        mContentValues.putNull(AppInfoColumns.FUNC_CLEAR);
        return this;
    }

    public AppInfoContentValues putDatakitConnected(@Nullable Boolean value) {
        mContentValues.put(AppInfoColumns.DATAKIT_CONNECTED, value);
        return this;
    }

    public AppInfoContentValues putDatakitConnectedNull() {
        mContentValues.putNull(AppInfoColumns.DATAKIT_CONNECTED);
        return this;
    }
}
