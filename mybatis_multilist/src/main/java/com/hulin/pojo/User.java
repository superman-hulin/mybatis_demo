package com.hulin.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @program: mybatis_environment
 * @description: 用户和账户一对多的实体类
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
