package com.aoptest.service.impl;

import com.aoptest.service.UserService;
import org.springframework.stereotype.Service;

@Service("sv")
public class UserServiceImpl implements UserService {
    @Override
    public void ff1() {
        System.out.println("方法1");
    }

    @Override
    public void ff2() {
        System.out.println("方法2");
    }

    @Override
    public void ff3() {
        System.out.println("方法3");
    }

    @Override
    public void ff4() {
        System.out.println("方法4");
//        System.out.println(5/0);
    }

    @Override
    public void ff5() {
        System.out.println("方法5");
//        System.out.println(5/0);
    }
}
