package org.md2k.mcerebrum.core.access.userinfo;

// @formatter:off
import android.net.Uri;
import android.provider.BaseColumns;

import org.md2k.mcerebrum.core.access.SampleProvider;
import org.md2k.mcerebrum.core.access.base.AbstractSelection;
import org.md2k.mcerebrum.core.access.appinfo.AppInfoColumns;
import org.md2k.mcerebrum.core.access.configinfo.ConfigInfoColumns;
import org.md2k.mcerebrum.core.access.serverinfo.ServerInfoColumns;
import org.md2k.mcerebrum.core.access.studyinfo.StudyInfoColumns;
import org.md2k.mcerebrum.core.access.userinfo.UserInfoColumns;

/**
 * User information
 */
@SuppressWarnings("unused")
public class UserInfoColumns implements BaseColumns {
    public static final String TABLE_NAME = "user_info";
    public static final Uri CONTENT_URI = Uri.parse(SampleProvider.CONTENT_URI_BASE + "/" + TABLE_NAME);

    /**
     * Primary key.
     */
    public static final String _ID = BaseColumns._ID;

    public static final String UID = "uid";

    public static final String TYPE = "type";

    public static final String USERNAME = "username";


    public static final String DEFAULT_ORDER = null;

    public static final String[] ALL_COLUMNS = new String[] {
            _ID,
            UID,
            TYPE,
            USERNAME
    };

    public static boolean hasColumns(String[] projection) {
        if (projection == null) return true;
        for (String c : projection) {
            if (c.equals(UID) || c.contains("." + UID)) return true;
            if (c.equals(TYPE) || c.contains("." + TYPE)) return true;
            if (c.equals(USERNAME) || c.contains("." + USERNAME)) return true;
        }
        return false;
    }

}
