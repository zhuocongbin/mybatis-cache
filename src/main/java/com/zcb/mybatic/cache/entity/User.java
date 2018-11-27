package com.zcb.mybatic.cache.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * Created by zhuocongbin
 * date 2018/11/27
 */
@Data
@ToString
public class User {
    private Integer id;
    private String name;
    private String password;
    private Date datetime;
}
