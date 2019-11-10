package com.example.bills.service;

import com.example.bills.model.User;
import com.example.bills.utils.ConcurrentUtils;
import org.springframework.stereotype.Service;

/**
 * @Auther: 李清依
 * @Date: 2019/11/10 09:00
 * @Description:
 */
@Service
public class HostHolder {
    public User getUser(){
        return ConcurrentUtils.getHost();
    }
    public void setUser(User user){
        ConcurrentUtils.setHost(user);
    }

}
