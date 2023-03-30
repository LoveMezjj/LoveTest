package com.shopping.mapper;

import com.shopping.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
//    增加
    Integer add(@Param(value = "user") User user);
//    删除
    Integer del(Integer id);
//    修改
    Integer update(@Param(value = "user1") User user);
//    查询
    User findById(Integer id);
//    查询全部
    List<User> findAll();
}
