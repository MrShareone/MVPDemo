package com.example.mr_shareone.mvp.login;

import android.widget.Toast;

/**
 * Autor：created by MR-SHAREONE on 2018/6/4 18 49
 * Emain:13437105740@163.com
 */
public class MyPresenter implements ILoginPresenter {
    ILoginModel loginModel;  //模型
    ILoginView loginView;   //视图

    public MyPresenter(ILoginView loginView) {
        this.loginView = loginView;
        loginModel = new MyModel();
    }

    /**
     * 调用model执行相应的数据判断读写，调用view进行响应
     */
    @Override
    public void doLogin() {
        loginView.showProgress(false);
        if(loginModel.isLoginRight(loginView.getName(),loginView.getPassword())){
            loginView.showLoginResult(true);
        }else{
            loginView.showLoginResult(false);
        }

    }

}
