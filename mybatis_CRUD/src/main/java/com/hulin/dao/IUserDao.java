package com.hulin.dao;

import com.hulin.pojo.User;

import java.util.List;

public interface IUserDao {
    List<User> findAll();
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(Integer userId);
    User findById(Integer userId);
    /*
    根据名称模糊查询
     */
    List<User> findByUsername(String username);
    /*
    查询总记录数
     */
    int findTotal();
}
