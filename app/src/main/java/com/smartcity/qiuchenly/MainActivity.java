package com.smartcity.qiuchenly;


import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.smartcity.qiuchenly.Base.ActivitySet;
import com.smartcity.qiuchenly.Base.BaseActivity;
import com.smartcity.qiuchenly.Base.ShareUtils;

public class MainActivity extends BaseActivity {

  Toolbar toolbar = null;
  EditText user, pass;
  Button btn;


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

    //go(SecondActivity.class,3000,true);
  }

  @Override
  public void click(View v) {
    switch (v.getId()) {
      case R.id.login:
        //需要验证用户名和密码的 此处跳过
        ShareUtils.put("isLogin",true);
        go(SecondActivity.class, 2000, true);
        break;
    }
  }

  @Override
  public void findID() {
    user = find(R.id.UserName);
    pass = find(R.id.passWord);
    btn = find(R.id.login, true);
    toolbar = find(R.id.toolbar);
    setSupportActionBar(toolbar);
  }
}
