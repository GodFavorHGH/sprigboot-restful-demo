package com.haugv.mapper;

import com.haugv.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    int createUser(User user);

    User getUser(int id);

    int updateUser(User user);

    int deleteUser(int id);

}
