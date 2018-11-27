package com.zcb.mybatic.cache.dao;

import com.zcb.mybatic.cache.component.SQLSessionFactory;
import com.zcb.mybatic.cache.entity.User;
import com.zcb.mybatic.cache.mapperInter.UserMapping;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by zhuocongbin
 * date 2018/11/27
 */
public class UserDao {
    /*private static SqlSession session;
    static {
        session = SQLSessionFactory.getSession();
    }*/
    public User getById(Integer id) {
        try(SqlSession session = SQLSessionFactory.getSession()) {
            UserMapping mapper = session.getMapper(UserMapping.class);
            User user = mapper.getById(id);
            return user;
        }
    }
}
