package com.haugv.controller;

import cn.hutool.core.bean.BeanUtil;
import com.haugv.common.Result;
import com.haugv.entity.Account;
import com.haugv.entity.User;
import com.haugv.service.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class AccountController {

    @Resource
    private RestTemplate restTemplate;
    @Resource
    private AccountService accountService;

    @PostMapping("/account/create")
    public Result createAccount(Account account){
        int count = accountService.createAccount(account);
        return count == 1 ? new Result(200,"账户创建成功！",null) : new Result(444,"账户创建失败！",null);
    }

    @GetMapping("/account/detail")
    public Result getAccount(@RequestParam("id") int id){
        Account account = accountService.getAccount(id);
        Result restData = restTemplate.getForObject("http://127.0.0.1:1001/user/detail?id="+id, Result.class);
        User user = BeanUtil.mapToBean((Map)restData.getData(), User.class, true);
        if (account != null) {
            account.setUser(user);
        }
        return account != null ? new Result(200,"账户查询成功！",account) : new Result(444,"查询无此账户！");
    }
}
