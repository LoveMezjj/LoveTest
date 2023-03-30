package com.shopping.service.impl;

import com.shopping.mapper.UserMapper;
import com.shopping.pojo.User;
import com.shopping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    private UserMapper userMapper;
    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
    //增加
    @Override
    public Integer add(User user) {
        return userMapper.add(user);
    }
    //删除
    @Override
    public Integer del(Integer uid) {
        return userMapper.del(uid);
    }
    //修改
    @Override
    public Integer update(User user) {
        return userMapper.update(user);
    }
    //查询
    @Override
    public User find(Integer uid) {
        return userMapper.findById(uid);
    }
    //查询全部
    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
