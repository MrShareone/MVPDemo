package com.example.mr_shareone.mvp.login;

/**
 * Autor：created by MR-SHAREONE on 2018/6/4 18 50
 * Emain:13437105740@163.com
 */
public class MyModel implements ILoginModel{

    @Override
    public boolean isLoginRight(String u, String p) {
        if(u.equals("zsw") && p.equals("123")){
            return true;
        }else{
            return false;
        }
    }
}
