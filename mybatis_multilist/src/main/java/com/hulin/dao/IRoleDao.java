package com.hulin.dao;

import com.hulin.pojo.Role;

import java.util.List;

public interface IRoleDao {
    //查询角色 同时获取对应用户的信息
    List<Role> findAll();
}
