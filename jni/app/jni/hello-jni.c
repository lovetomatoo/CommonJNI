//
// Created by guo on 2017/4/28.
//

#include "com_maimiao_live_jni_JNIAdapter.h"
/*
 * Class:     com_maimiao_live_jni_JNIAdapter
 * Method:    stringFromJNI
 * Signature: ()Ljava/lang/String;
 */
jstring Java_com_maimiao_live_jni_JNIAdapter_getstringFromJNI
  (JNIEnv *env, jobject obj){
     return (*env)->NewStringUTF(env,"I am from C, my name is Hello World");
  }

