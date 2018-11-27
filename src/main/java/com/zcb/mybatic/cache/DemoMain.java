package com.zcb.mybatic.cache;

import com.zcb.mybatic.cache.dao.UserDao;

/**
 * Created by zhuocongbin
 * date 2018/11/27
 */
public class DemoMain {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        System.out.println(userDao.getById(2));
        System.out.println(userDao.getById(2));
        System.out.println(userDao.getById(2));
        System.out.println(userDao.getById(2));
    }
}
