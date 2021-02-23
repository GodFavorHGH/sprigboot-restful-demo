package com.haugv.mapper;

import com.haugv.entity.Account;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper {

    int createAccount(Account account);

    Account getAccount(int id);

    int updateAccount(Account account);

    int deleteAccount(int id);

}
