package com.hulin.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @program: mybatis_environment
 * @description: 用户和账户一对多的实体类
 * 延迟加载：在真正使用数据时才发起查询，不用的时候不查询，按需加载（懒加载），一般用于一对多和多对多
 * 立即加载：不管用不用，只要一调用方法，马上发起查询 一般用于一对一和多对一
 * @author: Su
 * @create: 2020-08-03 17:16
 **/
@Data
public class User implements Serializable {

    private Integer id;
    private String username;
    private Date birthday;
    private String sex;
    private String address;
    //一对多关系映射，主表实体应该包含从表实体的集合引用
    private List<Account> accounts;
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
