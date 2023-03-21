package com.mvc.controller;

import com.mvc.pojo.User;
import com.mvc.returndata.UserReturnData;
import com.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {
    private UserService userService;
    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("{uid}")
    public UserReturnData find(@PathVariable Integer uid){
        UserReturnData ud=new UserReturnData();
        User user = userService.find(uid);
        if (user!=null){
            ud.setStatue(1000);
            ud.setInfo("请求成功");
            ud.setUser(user);
        }else {
            ud.setStatue(1001);
            ud.setInfo("请求失败");
            ud.setUser(user);
        }
        return ud;
    }
}
