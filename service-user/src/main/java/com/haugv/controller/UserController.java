package com.haugv.controller;

import com.haugv.common.Result;
import com.haugv.entity.User;
import com.haugv.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/user/create")
    public Result createUser(User user){
        int result = userService.createUser(user);
        return result == 1 ? new Result(200,"用户新增成功！",null) : new Result(444,"用户新增失败！",null);
    }

    @GetMapping("/user/detail")
    public Result getUserDetail(@RequestParam("userId") Long userId){
        return new Result(200,"查询成功！",null);
    }
}
