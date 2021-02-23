package com.haugv.service.impl;

import com.haugv.entity.User;
import com.haugv.mapper.UserMapper;
import com.haugv.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public int createUser(User user) {
        return userMapper.createUser(user);
    }

    @Override
    public User getUser(int id) {
        return userMapper.getUser(id);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return userMapper.deleteUser(id);
    }
}
