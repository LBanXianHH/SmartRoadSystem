package com.smartcity.qiuchenly;

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
   *
   * @return
   */
  @Override
  public ActivitySet getLayoutSetting() {
    ActivitySet set = new ActivitySet();
    set.TranslateBar = false;
    set.doubleClickExitActivity = false;
    set.noClickBack = true;
    return set;
  }

  @Override
  protected void ready() {

  }
}
