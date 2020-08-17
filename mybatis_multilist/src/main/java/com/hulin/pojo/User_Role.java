package com.hulin.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @program: mybatis_multilist
 * @description: 用户和角色多对多的用户实体类
 * @author: Su
 * @create: 2020-08-11 17:35
 **/
@Data
public class User_Role {
    private Integer id;
    private String username;
    private Date birthday;
    private String sex;
    private String address;
}
