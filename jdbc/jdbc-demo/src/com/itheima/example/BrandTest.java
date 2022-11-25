package com.itheima.example;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.itheima.pojo.Books;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class BrandTest {
    public static void main(String[] args) throws Exception {
        // 3.加载配置文件
        Properties prop = new Properties();
        prop.load(new FileInputStream("jdbc-demo/src/druid.properties"));

        // 4.获取连接池对象
        DataSource dataSource =  DruidDataSourceFactory.createDataSource(prop);

        // 5.获取数据库连接Connection
        Connection conn = dataSource.getConnection();

        // 2.定义sql语句
        String sql = "select * from books";

        // 3.获取pstm对象
        PreparedStatement pstmt =  conn.prepareStatement(sql);

        // 4.设置参数

        // 5.执行sql
        ResultSet rs = pstmt.executeQuery(sql);

        // 6.处理结果 List<Books> 封装为Books对象，装载到List集合

        // 释放z
        Books books = null;
        List<Books> booksList = new ArrayList<>();
        while (rs.next()){
            // 获取数据
            String id = rs.getString("id");
            String title = rs.getString("title");
            String publisher = rs.getString("publisher");
            int price = rs.getInt("price");
            int number = rs.getInt("number");
            // 封装Books对象
            books = new Books();
            books.setId(id);
            books.setTitle(title);
            books.setPublisher(publisher);
            books.setPrice(price);
            books.setNumber(number);

            // 装载集合
            booksList.add(books);
        }

        System.out.println(booksList);
        // 7.释放资源
        rs.close();
        pstmt.close();
        conn.close();
    }



}
