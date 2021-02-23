package com.haugv.service;

import com.haugv.entity.Account;

public interface AccountService {

    int createAccount(Account account);

    Account getAccount(int id);

    int updateAccount(Account account);

    int deleteAccount(int id);

}
