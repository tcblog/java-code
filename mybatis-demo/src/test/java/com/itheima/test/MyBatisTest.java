package com.itheima.test;

import com.itheima.mapper.BrandMapper;
import com.itheima.mapper.UserMapper;
import com.itheima.pojo.Brand;
import com.itheima.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest {
    @Test
    public void testSelectAll() throws IOException {
        // 1.获取SqlsessionFactory
        // 1.加载mybatis的核心配置文件，获取SqlSession对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 2.获取获取Sqlsession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 3.获取Mapper接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        // 4.执行方法
        List<Brand> brands = brandMapper.selectALL();

        System.out.println(brands);

        // 5.释放资源
        sqlSession.close();
    }

    @Test
    public void testSelectById() throws IOException {
        // 获取参数
        int id = 2;


        // 1.获取SqlsessionFactory
        // 1.加载mybatis的核心配置文件，获取SqlSession对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 2.获取获取Sqlsession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 3.获取Mapper接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        // 4.执行方法
        Brand brand = brandMapper.selectById(id);
        System.out.println(brand);

        // 5.释放资源
        sqlSession.close();
    }
    @Test
    public void testSelectByCondition() throws IOException {
        // 获取参数

        // 启用的
        int status = 1;
        // 企业名称包含华为
        String companyName = "华为";
        // 品牌名称包含华为
        String brandName = "华为";

        // 处理参数
        companyName = "%" + companyName +"%";
        brandName = "%" + brandName +"%";

        // 1.获取SqlsessionFactory
        // 1.加载mybatis的核心配置文件，获取SqlSession对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 2.获取获取Sqlsession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 3.获取Mapper接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        // 4.执行方法
        List<Brand> brands = brandMapper.selectByCondition(status, companyName, brandName);
        System.out.println(brands);

        // 5.释放资源
        sqlSession.close();
    }

    @Test
    public void testadd() throws IOException {
        // 获取参数

        // 启用的
        int status = 1;
        // 企业名称包含华为
        String companyName = "波导手机";
        // 品牌名称包含华为
        String brandName = "波导";
        String description = "手机中的战斗机";
        int ordered = 100;

        // 封装对象
        Brand brand = new Brand();
        brand.setStatus(status);
        brand.setCompanyName(companyName);
        brand.setBrandName(brandName);
        brand.setDescription(description);
        brand.setOrdered(ordered);

        // 1.获取SqlsessionFactory
        // 1.加载mybatis的核心配置文件，获取SqlSession对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 2.获取获取Sqlsession对象  并自动开启事务
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        // 3.获取Mapper接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        // 4.执行方法
        brandMapper.add(brand);
        Integer id = brand.getId();
        System.out.println(id);

        // 提交事物
        sqlSession.commit();

        // 5.释放资源
        sqlSession.close();
    }

    @Test
    public void testupdate() throws IOException {
        // 获取参数

        // 启用的
        int status = 1;
        // 企业名称包含华为
        String companyName = "波导手机";
        // 品牌名称包含华为
        String brandName = "波导";
        String description = "波导手机,手机中的战斗机";
        int ordered = 200;
        int id = 5;

        // 封装对象
        Brand brand = new Brand();
        brand.setStatus(status);
        brand.setCompanyName(companyName);
        brand.setBrandName(brandName);
        brand.setDescription(description);
        brand.setOrdered(ordered);
        brand.setId(id);

        // 1.获取SqlsessionFactory
        // 1.加载mybatis的核心配置文件，获取SqlSession对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 2.获取获取Sqlsession对象  并自动开启事务
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        // 3.获取Mapper接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        // 4.执行方法
        int count = brandMapper.update(brand);
        System.out.println(count);

        // 提交事物
        sqlSession.commit();

        // 5.释放资源
        sqlSession.close();
    }

    @Test
    public void testDeleteById() throws IOException {
        // 获取参数

        int id = 5;



        // 1.获取SqlsessionFactory
        // 1.加载mybatis的核心配置文件，获取SqlSession对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 2.获取获取Sqlsession对象  并自动开启事务
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        // 3.获取Mapper接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        // 4.执行方法
        brandMapper.deleteById(id);

        // 提交事物
        sqlSession.commit();

        // 5.释放资源
        sqlSession.close();
    }

    @Test
    public void testDeleteByIds() throws IOException {
        // 获取参数

        int[] ids = {6,7,8};



        // 1.获取SqlsessionFactory
        // 1.加载mybatis的核心配置文件，获取SqlSession对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 2.获取获取Sqlsession对象  并自动开启事务
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        // 3.获取Mapper接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        // 4.执行方法
        brandMapper.deleteByIds(ids);

        // 提交事物
        sqlSession.commit();

        // 5.释放资源
        sqlSession.close();
    }

    @Test
    public void testUserSelectAll() throws IOException {
        // 1.获取SqlsessionFactory
        // 1.加载mybatis的核心配置文件，获取SqlSession对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 2.获取获取Sqlsession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 3.获取Mapper接口的代理对象
        UserMapper UserMapper = sqlSession.getMapper(UserMapper.class);

        // 4.执行方法
        List<User> users = UserMapper.selectALL();

        System.out.println(users);

        // 5.释放资源
        sqlSession.close();
    }

}
