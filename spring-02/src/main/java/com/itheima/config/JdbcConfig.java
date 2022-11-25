package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


//@Configuration
public class JdbcConfig {
    // 1.定义一个方法获得要管理的对象
    // 2.添加@Bean，表示当前方法的返回值是一个bean
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String userName;
    @Value("${jdbc.password}")
    private String password;

    @Bean
    public DataSource dataSource(BookDao bookDao){
        System.out.println(bookDao);
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/library");
        ds.setUsername("root");
        ds.setPassword("0000");
        return ds;
    }
}
