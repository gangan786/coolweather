package com.coolweather.android.util;

import android.util.Log;

/**
 * Created by 陈淦 on 2017/5/19. 工具类 自定义日志工具
 */

public class LogUtil {
    public static final int VERBOSE = 1;

    public static final int DEBUG = 2;

    public static final int INFO = 3;

    public static final int WARN = 4;

    public static final int ERROR = 5;

    public static final int NOTHING = 6;

    public static final int level = VERBOSE;

    public static void v(String tag, String msg) {
        if (level <= VERBOSE && !tag.equals("ChooseAreaFragment") && !tag.equals("Utility")) {
            Log.v(tag, msg);
        }
    }

    public static void d(String tag, String msg) {
        if (level <= DEBUG && !tag.equals("ChooseAreaFragment") && !tag.equals("Utility")) {
            Log.d(tag, msg);
        }
    }

    public static void i(String tag, String msg) {
        if (level <= INFO && !tag.equals("ChooseAreaFragment") && !tag.equals("Utility")) {
            Log.i(tag, msg);
        }
    }

    public static void w(String tag, String msg) {
        if (level <= WARN && !tag.equals("ChooseAreaFragment") && !tag.equals("Utility")) {
            Log.w(tag, msg);
        }
    }

    public static void e(String tag, String msg) {
        if (level <= ERROR && !tag.equals("ChooseAreaFragment") && !tag.equals("Utility")) {
            Log.e(tag, msg);
        }
    }

}
