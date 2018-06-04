package com.example.mr_shareone.mvp.login;

import android.content.Context;

/**
 * Autor：created by MR-SHAREONE on 2018/6/4 19 11
 * Emain:13437105740@163.com
 */
public interface ILoginView {
    //获取用户名称
    public String getName();

    //获取用户密码
    public String getPassword();

    //显示进度条
    public void showProgress(boolean b);

    //获取上下文
    public Context getContext();

    //显示登录结果
    public void showLoginResult(boolean b);
}
