package com.zcb.mybatic.cache.component;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

/**
 * Created by zhuocongbin
 * date 2018/11/27
 */
public class SQLSessionFactory {
    private static SqlSessionFactory sessionFactory;
    static {
        initSessionFactory();
    }
    private static void initSessionFactory() {
        try {
            sessionFactory = new SqlSessionFactoryBuilder().
                    build(Resources.getResourceAsStream(SQLSessionFactory.class.getClassLoader(), "mybatis.xml"));
        } catch (IOException e) {
            System.exit(0);
        }
    }
    public static SqlSession getSession() {
        return sessionFactory.openSession(true);
    }
}
