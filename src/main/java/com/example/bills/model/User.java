package com.example.bills.model;

import lombok.Data;

/**
 * @Auther: 李清依
 * @Date: 2019/11/9 16:38
 * @Description:
 */
@Data
public class User {
    private int id;

    private String name;

    private String email;

    /**
     * 经过md5加密
     */
    private String password;
}
