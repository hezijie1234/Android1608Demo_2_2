package com.androidxx.yangjw.day38_coordinatorlayout_behavior_demo;

import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * CoordinatorLayout的自定义行为
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view) {
        view.setY(view.getY()+10);
    }

    public void click2(View view) {
        ViewCompat.offsetLeftAndRight(view,2);
    }
}
