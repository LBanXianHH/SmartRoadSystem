package com.smartcity.qiuchenly;

import android.view.View;

import com.smartcity.qiuchenly.Base.ActivitySet;
import com.smartcity.qiuchenly.Base.BaseActivity;

public class SplashActivity extends BaseActivity {

  /**
   * 基本Activity布局设置
   *
   * @return
   */
  @Override
  public int getLayout() {
    return R.layout.activity_splash;
  }


  /**
   * 基本activity设置封装
   * @return
   */
  @Override
  public ActivitySet getLayoutSetting() {
    ActivitySet set = new ActivitySet();
    set.TranslateBar = true;//此选项表示是否透明状态栏
    set.doubleClickExitActivity = false;//此选项设置表示双击退出整个App
    set.noClickBack = true;//设置此选项表示在此界面时点击返回键无其他操作
    return set;
  }

  /**
   * 本子程序作用是当整个Activity初始化完成时执行的操作
   */
  @Override
  public void ready() {
    go(MainActivity.class,2000);
  }

  /**
   * 当findID结束后,被点击的控件响应事件统一管理子程序
   *
   * @param v 被传过来的点击的View
   */
  @Override
  public void click(View v) {

  }

  /**
   * 在这里设置控件的findViewById
   */
  @Override
  public void findID() {
  }
}
