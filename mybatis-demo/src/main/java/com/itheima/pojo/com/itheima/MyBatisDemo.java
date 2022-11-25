package com.itheima.pojo.com.itheima;

import com.itheima.mapper.UserMapper;
import com.itheima.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * mybatis代理开发
 */

public class MyBatisDemo  {
    public static void main000000(String[] args) throws IOException {
        // 1.加载mybatis的核心配置文件，获取SqlSession对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 2.获取SqlSession对象，用它来执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 3.执行sql
//        List<User> users = sqlSession.selectList("test.selectALL");

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectALL();
        System.out.println(users);

        // 4.释放资源
        sqlSession.close();
    }
}
