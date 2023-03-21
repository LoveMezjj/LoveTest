package com.mvc.service.impl;

import com.mvc.dao.UserDao;
import com.mvc.pojo.User;
import com.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User find(Integer uid) {
        return userDao.findById(uid);
    }
}
