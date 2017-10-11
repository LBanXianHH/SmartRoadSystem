package com.smartcity.qiuchenly.Base;

import android.app.Activity;

/**
 * Author: QiuChenly
 * Date   : 2017/10/11
 * Usage :基本类,所有Activity应继承此类
 * Lasted:2017 10 11
 * ProjectName:2
 * Create: 2017 10 11 , on 11:06
 */

public abstract class BaseActivity extends Activity {

  //here set Content layout
  public abstract int getLayout();

  //here set Layout Content Setting
  public abstract ActivitySet getLayoutSetting();

  //This set TranslateBar
  private boolean translateBar = false;
}
