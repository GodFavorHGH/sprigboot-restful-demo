package com.haugv.service;

import com.haugv.entity.User;

public interface UserService {

    int createUser(User user);

    User getUser(int id);

    int updateUser(User user);

    int deleteUser(int id);

}
