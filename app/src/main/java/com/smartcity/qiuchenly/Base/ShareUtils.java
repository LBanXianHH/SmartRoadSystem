package com.smartcity.qiuchenly.Base;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Author: QiuChenly
 * Date   : 2017/10/14
 * Usage :
 * Lasted:2017 10 14
 * ProjectName:SmartRoadSystem
 * Create: 2017 10 14 , on 16:35
 */

public class ShareUtils {

  //使用设计思想: 单例模式
  static SharedPreferences share = null;


  /**
   * Context 参数传进来的意义
   * 不同的Activity是不会共享一个Preferences的,需要传一个指定的上下文 来统一调用
   *
   * @param con
   * @return
   */
  public static SharedPreferences getSharePreferences(Context con) {
    if (share == null)
      share = con.getSharedPreferences("QiuChenPreferences", Context.MODE_PRIVATE);
    return share;
  }

  public static  <T> void put(String key, T data) {
    SharedPreferences.Editor edit = share.edit();
    edit.putString(key, data.toString());
    edit.apply();
    edit.commit();
  }

  public static void put(String key, boolean data) {
    SharedPreferences.Editor edit = share.edit();
    edit.putBoolean(key, data);
    edit.apply();
    edit.commit();
  }

  public static String get(String key) {
    return share.getString(key,"");
  }

  public static boolean getBoolean(String key) {
    return share.getBoolean(key,false);
  }
}
