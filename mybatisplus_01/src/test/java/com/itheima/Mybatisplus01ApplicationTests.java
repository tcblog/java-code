package com.itheima;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Wrapper;
import java.util.List;

@SpringBootTest
class Mybatisplus01ApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void testGetAll() {
        // 方式1：按条件查询
//        QueryWrapper qw = new QueryWrapper();
//        qw.lt("age",10);
//        List<User> userList = userDao.selectList(qw);
//        System.out.println(userList);

        // 方式2：lambda格式条件查询
//        QueryWrapper<User> qw = new QueryWrapper<User>();
//        qw.lambda().lt(User::getAge,20);
//        List<User> userList = userDao.selectList(qw);
//        System.out.println(userList);

        // 方式3：lambda格式条件查询
//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
//        lqw.lt(User::getAge,20).or().gt(User::getAge,10);
////        lqw.gt(User::getAge,10);
//        List<User> userList = userDao.selectList(lqw);
//        System.out.println(userList);


////        null 判定
//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
//        // 先判定第一个参数是否为true，如果为true连接当前条件
//
//
//        List<User> userList = userDao.selectList(lqw);
//        System.out.println(userList);



//        // 条件查询
//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
//
//        // eq 等同于 =
//        lqw.eq(User::getName,"Tom666").eq(User::getPassword,"ctc");
//
//        List<User> userList = userDao.selectList(lqw);
//        System.out.println(userList);


        //        // 条件查询
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();

        // eq 等同于 =
        lqw.eq(User::getName,"Tom666").eq(User::getPassword,"ctc");

        User loginUser = userDao.selectOne(lqw);
        System.out.println(loginUser);

    }

    @Test
    void testSave() {
        User user = new User();
        user.setName("chw");
        user.setPassword("0000");
        user.setAge(19);
        user.setTel("100");
        userDao.insert(user);
    }

    @Test
    void testDelete() {
       userDao.deleteById(1593604594565427201L);
    }

    @Test
    void testUpdate(){
        User user = new User();
        user.setId(2L);
        user.setName("Tom555");

        userDao.updateById(user);
    }

    @Test
    void testGetById() {
        User user = userDao.selectById(2L);
        System.out.println(user);
    }

}
