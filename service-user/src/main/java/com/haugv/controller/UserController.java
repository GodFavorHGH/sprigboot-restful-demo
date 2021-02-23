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
    public Result getUser(@RequestParam("id") int id){
        User user = userService.getUser(id);
        return user!=null ? new Result(200,"用户查询成功！",user) : new Result(444,"查询无此用户！");
    }

    @PostMapping("/user/update")
    public Result updateUser(User user){
        int result = userService.updateUser(user);
        return result == 1 ? new Result(200,"用户更新成功！",user) : new Result(444,"用户更新失败！",null);
    }

    @GetMapping("/user/delete")
    public Result deleteUser(@RequestParam("id") int id){
        int result = userService.deleteUser(id);
        return result == 1 ? new Result(200,"用户删除成功！",null) : new Result(444,"用户删除失败！");
    }

    @GetMapping("/user/hello")
    public Result hello(){
        return new Result(200,"hello！",null);
    }
}
