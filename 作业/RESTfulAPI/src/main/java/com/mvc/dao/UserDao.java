package com.mvc.dao;

import com.mvc.pojo.User;

public interface UserDao {
    User findById(Integer uid);
}
