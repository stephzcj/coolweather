package com.coolweather.android.util;

/**
 * Created by zhongchunjie on 17/4/26.
 */

public class Log {
    private static int level=0;
    private static int LEVEL_VERBOSE=1;
    private static int LEVEL_DEBUG=2;
    private static int LEVEL_INFO=3;
    private static int LEVEL_WARN=4;
    private static int LEVEL_ERROR=5;

    public static void v(String tag,String logContent){
        if(level<LEVEL_VERBOSE){
            android.util.Log.v(tag, logContent);
        }
    }
    public static void d(String tag,String logContent){
        if(level<LEVEL_DEBUG){
            android.util.Log.d(tag, logContent);
        }
    }
    public static void i(String tag,String logContent){
        if(level<LEVEL_INFO){
            android.util.Log.i(tag, logContent);
        }
    }
    public static void w(String tag,String logContent){
        if(level<LEVEL_WARN){
            android.util.Log.w(tag, logContent);
        }
    }
    public static void e(String tag,String logContent){
        if(level<LEVEL_ERROR){
            android.util.Log.e(tag, logContent);
        }
    }

}
