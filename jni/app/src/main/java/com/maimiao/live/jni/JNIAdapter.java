package com.maimiao.live.jni;

/**
 * Created by guo_hx on 2017/4/28 11:07.
 */

public class JNIAdapter {

    static {
        System.loadLibrary("hello-jni");
    }

    public String stringFromJNIs() {
        return getstringFromJNI();
    }

    public native String getstringFromJNI();
}
