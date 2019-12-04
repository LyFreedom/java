package com.ly.mycontroller;

/**
 * 为外部类提供必要的功能组件
 */
public class Bank { //银行功能模块
    private static User[] users = new User[5]; //创建数组，为了存储已开户的用户信息
    public void login(){}

    private static class Information{
        static {
            users[0] = new User();
            users[1] = new User();
            users[2] = new User();
        }
    }
}


class User{

}