package com.mvc.dao.impl;

import com.mvc.dao.UserDao;
import com.mvc.pojo.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public User findById(Integer uid) {
        User user1=new User(1,"青龙","ql");
        User user2=new User(2,"白虎","bh");
        User user3=new User(3,"朱雀","zq");
        User user4=new User(4,"玄武","xw");
        User user5=new User(5,"麒麟","ql");
        User user;
        switch (uid){
            case 1:
                user=user1;
                break;
            case 2:
                user=user2;
                break;
            case 3:
                user=user3;
                break;
            case 4:
                user=user4;
                break;
            default:
                user=user5;
                break;
        }
        return user;
    }
}
