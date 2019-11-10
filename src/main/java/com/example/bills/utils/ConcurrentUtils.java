package com.example.bills.utils;

import com.example.bills.model.User;

/**
 * @Auther: 李清依
 * @Date: 2019/11/10 08:59
 * @Description:
 */
public class ConcurrentUtils {
    private static ThreadLocal<User> host=new ThreadLocal<>();
    public static User getHost(){
        return host.get();
    }
    public static void setHost(User user){
        host.set(user);
    }
}
