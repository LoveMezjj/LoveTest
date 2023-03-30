package com.shopping.controller;

import com.shopping.pojo.User;
import com.shopping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;
    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    //增加
    @PostMapping
    public Integer add(@RequestBody User user){
        return userService.add(user);
    }
    //删除
    @DeleteMapping("/{id}")
    public Integer del(@PathVariable Integer id){
        return userService.del(id);
    }
    //修改
    @PutMapping
    public Integer update(@RequestBody User user){
        return userService.update(user);
    }
    //查询
    @GetMapping("/{id}")
    public User findById(@PathVariable Integer id){
        return userService.find(id);
    }
    //查询全部
    @GetMapping
    public List<User> findAll(){
        return userService.findAll();
    }
}
