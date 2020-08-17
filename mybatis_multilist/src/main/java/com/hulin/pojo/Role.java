package com.hulin.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @program: mybatis_multilist
 * @description: 角色实体类
 * @author: Su
 * @create: 2020-08-11 17:36
 **/
@Data
public class Role implements Serializable {
    private Integer roleId;
    private String roleName;
    private String roleDesc;
    //多对多的关系映射
    private List<User_Role> users;
}
