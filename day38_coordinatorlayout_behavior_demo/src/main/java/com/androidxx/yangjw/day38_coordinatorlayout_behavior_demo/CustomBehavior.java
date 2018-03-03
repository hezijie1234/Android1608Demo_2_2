package com.androidxx.yangjw.day38_coordinatorlayout_behavior_demo;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

/**
 * Created by yangjw on 2017/2/13.
 */
public class CustomBehavior extends CoordinatorLayout.Behavior<View> {

    public CustomBehavior() {
    }

    public CustomBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * 指定当前行为所依赖的控件或者是控件类型
     * @param parent 协调者布局对象
     * @param child 行为的所有者
     * @param dependency 行为的依赖者
     * @return
     */
    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, View child, View dependency) {
        if (dependency.getId() == R.id.btn_1) {
            return true;
        }
        return false;
    }

    /**
     * 当依赖的对象发生变化的时候，行为持有者需要执行此方法
     * @param parent 协调者布局对象
     * @param child 行为持有者
     * @param dependency 行为依赖者
     * @return
     */
    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, View child, View dependency) {
        child.setY(dependency.getY());
        child.setX(dependency.getX()+500);
        return true;
    }
}
