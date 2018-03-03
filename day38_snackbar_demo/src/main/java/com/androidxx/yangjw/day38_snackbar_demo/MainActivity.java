package com.androidxx.yangjw.day38_snackbar_demo;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

/**
 * SnackBar的基本使用
 * 最好结合CoordinatorLayout使用
 */
public class MainActivity extends AppCompatActivity {

    private CoordinatorLayout rootLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rootLayout = (CoordinatorLayout) findViewById(R.id.root_layout);

    }

    public void click(View view) {
        /**
         * 参数1：是一个容器（Layout），SnackBar将会显示到参数1指定的容器中
         */
        Snackbar.make(rootLayout,"这是一个提醒",Snackbar.LENGTH_SHORT)
                .setAction("知道了", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.i("zz", "onClick: ");
                    }
                })
                .show();
    }
}
