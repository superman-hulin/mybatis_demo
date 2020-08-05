package com.hulin.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: mybatis_environment
 * @description: 用户实体类
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
