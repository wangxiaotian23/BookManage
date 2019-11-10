package com.example.bills.service;

import com.example.bills.dao.UserDao;
import com.example.bills.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: 李清依
 * @Date: 2019/11/9 17:02
 * @Description:
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDAO;

    public int addUser(User user){
        return userDAO.addUser(user);
    }

    public User getUser(String email) {
        return userDAO.selectByEmail(email);
    }

    public User getUser(int uid) {
        return userDAO.selectById(uid);
    }
}
