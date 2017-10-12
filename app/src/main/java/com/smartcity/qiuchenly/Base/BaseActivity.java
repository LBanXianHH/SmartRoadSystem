package com.smartcity.qiuchenly.Base;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;

/**
 * Author: QiuChenly
 * Date   : 2017/10/11
 * Usage :基本类,所有Activity应继承此类
 * Lasted:2017 10 11
 * ProjectName:2
 * Create: 2017 10 11 , on 11:06
 */

public abstract class BaseActivity extends Activity implements View.OnClickListener {

  //here set Content layout
  public abstract int getLayout();

  //here set Layout Content Setting
  public abstract ActivitySet getLayoutSetting();

  //this is setDoubleClick
  private boolean doubleClickExit, noClickBack;

  @Override
  public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(getLayout());
    ActivitySet mSet = getLayoutSetting();
    if (mSet.TranslateBar) {
      ActionBar bar = getActionBar();
      if (bar != null) {
        bar.hide();
      }
    }
    doubleClickExit = mSet.doubleClickExitActivity;
    noClickBack = mSet.noClickBack;
    findID();
    ready();
  }

  protected abstract void ready();

  //this is delays
  private long upTime = 0, now;

  @Override
  public boolean onKeyUp(int keyCode, KeyEvent event) {
    //set Double Click with exit application
    if (doubleClickExit) {
      if (keyCode == KeyEvent.KEYCODE_BACK) {
        if ((now = System.currentTimeMillis()) - upTime > 2000) {
          upTime = now;
        } else {
          System.exit(0);
        }
      }
      return true;
    } else if (noClickBack) {
      return true;
    } else {
      return super.onKeyUp(keyCode, event);
    }
  }

  /**
   *
   * @param v
   */
  abstract void click(View v);

  abstract void findID();

  public <T extends View> T find(int id) {
    T t = super.findViewById(id);
    return t;
  }

  public <T extends View> T find(int id, boolean setThisOnClick) {
    T t = super.findViewById(id);
    if (setThisOnClick) {
      t.setOnClickListener(this);
    }
    return t;
  }

  @Override
  public void onClick(View view) {
    click(view);
  }

  <T> void Msg(T t) {
    Toast.makeText(this, t.toString(), Toast.LENGTH_SHORT).show();
  }

  <T> void Msg(T t, boolean isLong) {
    Toast.makeText(this, t.toString(), isLong ? Toast.LENGTH_LONG : Toast.LENGTH_SHORT).show();
  }
}
