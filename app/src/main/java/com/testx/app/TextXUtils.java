package com.testx.app;

import android.widget.Toast;

/**
 * @author : J-T
 * @date : 2022/6/27 15:31
 * description :
 */
public class TextXUtils {
    public static void show(String string) {
        Toast.makeText(MyApplication.context, string, Toast.LENGTH_SHORT).show();
    }
}
