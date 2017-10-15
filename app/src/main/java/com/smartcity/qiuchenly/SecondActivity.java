package com.smartcity.qiuchenly;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;

import com.smartcity.qiuchenly.Base.ActivitySet;
import com.smartcity.qiuchenly.Base.BaseActivity;

public class SecondActivity extends BaseActivity {

  FrameLayout menu;
  DrawerLayout draw;
  boolean isOpen = false;

  @Override
  public int getLayout() {
    return R.layout.activity_second;
  }

  @Override
  public ActivitySet getLayoutSetting() {
    ActivitySet set = new ActivitySet();
    set.TranslateBar = true;
    set.noClickBack = false;
    set.doubleClickExitActivity = true;
    return set;
  }

  @Override
  public void ready() {

  }

  @Override
  public void click(View v) {
    switch (v.getId()) {
      case R.id.menu:
        draw.openDrawer(Gravity.START);
        isOpen = true;
        break;
    }
  }

  @Override
  public void findID() {
    menu = find(R.id.menu, true);
    draw = find(R.id.drawerlayout);
  }

  @Override
  public boolean onKeyUp(int keyCode, KeyEvent event) {
    if (isOpen) {
      draw.closeDrawer(Gravity.START);
      isOpen=false;
      return true;
    }
    return super.onKeyUp(keyCode, event);
  }
}
