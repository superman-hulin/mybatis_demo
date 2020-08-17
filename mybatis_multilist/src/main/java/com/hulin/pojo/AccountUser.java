package com.hulin.pojo;

import lombok.Data;

/**
 * @program: mybatis_multilist
 * @description: 账户信息和用户信息的结合
 * @author: Su
 * @create: 2020-08-11 10:59
 **/
@Data
public class AccountUser extends Account {
    private String username;
    private String address;
}
