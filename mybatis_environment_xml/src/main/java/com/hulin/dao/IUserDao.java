package com.hulin.dao;

import com.hulin.pojo.User;

import java.util.List;

public interface IUserDao {
    List<User> findAll();
}
