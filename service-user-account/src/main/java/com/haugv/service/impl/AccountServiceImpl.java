package com.haugv.service.impl;

import com.haugv.entity.Account;
import com.haugv.mapper.AccountMapper;
import com.haugv.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountMapper accountMapper;

    @Override
    public int createAccount(Account account) {
        return accountMapper.createAccount(account);
    }

    @Override
    public Account getAccount(int id) {
        return accountMapper.getAccount(id);
    }

    @Override
    public int updateAccount(Account account) {
        return accountMapper.updateAccount(account);
    }

    @Override
    public int deleteAccount(int id) {
        return accountMapper.deleteAccount(id);
    }
}
