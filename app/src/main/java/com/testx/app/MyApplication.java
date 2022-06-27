package com.testx.app;

import android.app.Application;
import android.content.Context;

/**
 * @author : J-T
 * @date : 2022/6/27 15:33
 * description :
 */
public class MyApplication extends Application {
    public static Context context;

    public MyApplication() {
        context = this;
    }
}
