package com.maimiao.live.jni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTvJniMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTvJniMain = (TextView) findViewById(R.id.tv_jni_main);

        String s = new JNIAdapter().stringFromJNIs();

        mTvJniMain.setText(s);
    }
}
