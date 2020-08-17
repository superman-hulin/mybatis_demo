package com.hulin.dao;

import com.hulin.pojo.QueryVo;
import com.hulin.pojo.User;

import java.util.List;

public interface IUserDao {

    List<User> findAll();
    
    /**
    *@Description: 根据传入的参数条件进行查询
    *@Param: 参数user对象中有可能有用户名，有可能有性别等各种情况
    *@return: 
    *@Author: Su
    *@date: 2020/8/11
    */
    List<User> findUserByCondition(User user);
    
    /**
    *@Description: 根据queryVo中提供的id集合，查询对应的所有用户
    *@Param: 
    *@return: 
    *@Author: Su
    *@date: 2020/8/11
    */
    List<User> findUserInIds(QueryVo vo);

    User findById(Integer userId);
    /*
    根据名称模糊查询
     */
    List<User> findByUsername(String username);

    /*
    根据queryVo中的条件查询用户
       应用场景：需要将多个对象联合作为查询条件
     */
    List<User> findUserByVo(QueryVo vo);
}
