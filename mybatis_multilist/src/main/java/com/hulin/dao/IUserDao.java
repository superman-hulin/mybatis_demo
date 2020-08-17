package com.hulin.dao;


import com.hulin.pojo.User;

import java.util.List;

public interface IUserDao {
    //查询所有用户，同时获取该用户对应的所有账户信息，即一对多
    List<User> findAll();

    User findById(Integer userId);

}
