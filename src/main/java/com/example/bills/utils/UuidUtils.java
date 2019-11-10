package com.example.bills.utils;

import java.util.UUID;

/**
 * @Auther: 李清依
 * @Date: 2019/11/10 09:15
 * @Description:
 */
public class UuidUtils {
    public static String next(){
        return UUID.randomUUID().toString().replace("-","a");
    }
}
