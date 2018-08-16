package com.yanzhenjie.definebehavior;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 添加这个Activity的目的是为了APP秒开，详情看博客：http://blog.csdn.net/yanzhenjie1003/article/details/52201896
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

}
