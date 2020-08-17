package com.hulin.pojo;

import lombok.Data;

import java.util.List;

/**
 * @program: mybatis_CRUD
 * @description: 查询条件对象
 * @author: Su
 * @create: 2020-08-06 09:57
 **/
@Data
public class QueryVo {
    private User user;
    private List<Integer> ids;
}
