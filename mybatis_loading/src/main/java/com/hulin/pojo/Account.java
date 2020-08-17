package com.hulin.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: mybatis_multilist
 * @description: 账户实体类
 * @author: Su
 * @create: 2020-08-11 10:46
 **/
@Data
public class Account implements Serializable {
    private Integer id;
    private Integer uid;
    private Double money;
    //使用建立实体类关系来多表查询，实现一对一查询（mybatis将这种多对一的关系看成一对一）
    //从表实体应该包含一个主表实体的对象引用
    private User user;
}
