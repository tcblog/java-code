package com.itheima.book;

import com.itheima.mapper.BooksMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

// mybatisdemo 代理开发

public class MyBatisDemo2 {
    public static void main(String[] args) throws IOException {
        // 1.加载 MyBatis的核心配置文件，获取SqlSessionFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 2.获取SqlSessionFactory对象 用它来执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 3.执行sql
//        List<Book> books = sqlSession.selectList("test.selectAll");

        //3.1 获取BooksMapper接口的代理对象
        BooksMapper booksMapper = sqlSession.getMapper(BooksMapper.class);
        List<Book> books = booksMapper.selectAll();


        System.out.println(books);

        // 4.释放资源
        sqlSession.close();
    }
}
