package com.hulin.dao;

import com.hulin.pojo.Account;
import com.hulin.pojo.AccountUser;

import java.util.List;

public interface IAccountDao {

    List<Account> findAll();
    /**
    *@Description: 查询所有账户，并且同时带有对应的用户名称和地址信息
    *@Param:  使用account子类的方式实现，该方式使用不多
    *@return: 
    *@Author: Su
    *@date: 2020/8/11
    */
    List<AccountUser> findAllAccount();
}
