package com.shopping.service;

import com.shopping.pojo.User;

import java.util.List;

public interface UserService {
    Integer add(User user);
    Integer del(Integer uid);
    Integer update(User user);
    User find(Integer uid);
    List<User> findAll();
}
