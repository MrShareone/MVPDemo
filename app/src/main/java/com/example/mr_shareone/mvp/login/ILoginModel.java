package com.example.mr_shareone.mvp.login;

/**
 * Autor：created by MR-SHAREONE on 2018/6/4 19 23
 * Emain:13437105740@163.com
 */
public interface ILoginModel {
    /**
    * 判断登录信息是否正确
    *@param u   用户名称
     * @param p   用户密码
     * @author MR-SHAREONE
     * @return 登录信息正确返回true，否则返回false
    */
    public boolean isLoginRight(String u,String p);
}
