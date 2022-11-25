package com.itheima.jdbc;

import com.itheima.pojo.Books;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcResultSet {
    public static void main2(String[] args) throws Exception {
        // 1.注册驱动
//        Class.forName("com.mysql.jdbc.Driver");

        // 2.获取连接
        String url = "jdbc:mysql://127.0.0.1:3306/library?useSSL=false";
        String username = "root";
        String password = "0000";
        Connection conn = DriverManager.getConnection(url,username,password);

        // 3.定义sql
        String sql = "select * from books";

        // 4.获取statement对象
        Statement stmt = conn.createStatement();

        // 5.执行sql
        ResultSet rs =  stmt.executeQuery(sql);

        // 6.处理结果，遍历rs中的所有数据
        // 6.1 光标向下移动一行，并且判断当前行是否有数据
        while (rs.next()){
            // 6.2 获取数据 getXxx()
            String  id =  rs.getString(1);
            String title = rs.getString(2);
            String publisher =rs.getString(3);
            int price =rs.getInt(4);
            int number =rs.getInt(5);

            System.out.println(id);
            System.out.println(title);
            System.out.println(publisher);
            System.out.println(price);
            System.out.println(number);

            System.out.println("-----------------------");
        }

        // 7，释放资源
        rs.close();
        stmt.close();
        conn.close();

    }


    /**
     * 查询books表中数据，封装为Books类，并且存储到ArrayList集合中
     * 1.定义实体类Books
     * 2.查询数据，封装到Books中
     * 3.将Books对象存入到ArrayList中
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // 1.注册驱动
//        Class.forName("com.mysql.jdbc.Driver");

        // 2.获取连接
        String url = "jdbc:mysql://127.0.0.1:3306/library?useSSL=false&useServerPr";
        String username = "root";
        String password = "0000";
        Connection conn = DriverManager.getConnection(url,username,password);

        // 3.定义sql
        String sql = "select * from books";

        // 4.获取statement对象
        Statement stmt = conn.createStatement();

        // 5.执行sql
        ResultSet rs =  stmt.executeQuery(sql);

        // 创建集合
        List<Books> list = new ArrayList<>();

        // 6.处理结果，遍历rs中的所有数据
        // 6.1 光标向下移动一行，并且判断当前行是否有数据
        while (rs.next()){

            Books books = new Books();

            // 6.2 获取数据 getXxx()
            String  id =  rs.getString(1);
            String title = rs.getString(2);
            String publisher =rs.getString(3);
            int price =rs.getInt(4);
            int number =rs.getInt(5);

            // 赋值
            books.setId(id);
            books.setTitle(title);
            books.setPublisher(publisher);
            books.setPrice(price);
            books.setNumber(number);

            // 存入集合
            list.add(books);

//            System.out.println(id);
//            System.out.println(title);
//            System.out.println(publisher);
//            System.out.println(price);
//            System.out.println(number);
//
//            System.out.println("-----------------------");
        }

        System.out.println(list);
        // 7，释放资源
        rs.close();
        stmt.close();
        conn.close();

    }
}
