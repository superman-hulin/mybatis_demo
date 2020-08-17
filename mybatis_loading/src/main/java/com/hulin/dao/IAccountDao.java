package com.hulin.dao;

import com.hulin.pojo.Account;

import java.util.List;

public interface IAccountDao {

    List<Account> findAll();

    List<Account> findAccountByUid(String uid);

}
