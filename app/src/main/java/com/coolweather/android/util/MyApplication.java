package com.coolweather.android.util;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePal;

/**
 * Created by 陈淦 on 2017/5/19. 可用于全局获取Context
 */

public class MyApplication extends Application {

    public static Context context;

    @Override
    public void onCreate() {
        context=getApplicationContext();
        LitePal.initialize(context);//等同于在AndroidManifest中配置：android:name="org.litepal.LitePalApplication"
    }

    public static Context getContext() {
        return context;
    }
}
