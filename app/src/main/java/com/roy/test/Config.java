package com.roy.test;

import android.util.Log;

/**
 * Created by worldexcellent on 2016/2/21.
 */
public class Config {
    public static boolean DEBUG = true;
    public static String TAG = "RoyTest";


    public static void logd(String message) {
        if (BuildConfig.DEBUG) {
            Log.d(Config.TAG, message);
        }
    }

    public static void logd(Boolean message) {
        if (BuildConfig.DEBUG) {
            Log.d(Config.TAG, message.toString());
        }
    }

    public static void loge(String message) {
        if (BuildConfig.DEBUG) {
            Log.e(Config.TAG, message);
        }
    }

    public static void loge(Throwable th) {
        if (BuildConfig.DEBUG) {
            Log.e(Config.TAG, null, th);
        }
    }

    public static void logi(String message) {
        if (BuildConfig.DEBUG) {
            Log.i(Config.TAG, message);
        }
    }

    public static void logi(Boolean message) {
        if (BuildConfig.DEBUG) {
            Log.i(Config.TAG, message.toString());
        }
    }
}
