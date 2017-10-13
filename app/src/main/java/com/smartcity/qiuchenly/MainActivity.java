package com.smartcity.qiuchenly;


import android.support.v7.widget.Toolbar;
import android.view.View;

import com.smartcity.qiuchenly.Base.ActivitySet;
import com.smartcity.qiuchenly.Base.BaseActivity;

public class MainActivity extends BaseActivity {

  @Override
  public int getLayout() {
    return R.layout.activity_main;
  }

  @Override
  public ActivitySet getLayoutSetting() {
    ActivitySet set = new ActivitySet();
    set.noClickBack = false;
    set.doubleClickExitActivity = true;
    set.TranslateBar = true;
    return set;
  }

  @Override
  public void ready() {
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
  }

  @Override
  public void click(View v) {

  }

  @Override
  public void findID() {

  }
}
