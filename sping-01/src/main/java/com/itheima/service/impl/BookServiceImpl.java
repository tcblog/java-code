package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.dao.UserDao;
import com.itheima.service.BookService;

public class BookServiceImpl implements BookService {
    // 5.删除业务层中使用new的方式创建的dao对象
    private BookDao bookDao;
    private UserDao userDao;

    public BookServiceImpl(BookDao bookDao, UserDao userDao) {
        this.bookDao = bookDao;
        this.userDao = userDao;
    }

    public void  save(){
        System.out.println("book service save...");
        bookDao.save();
        userDao.save();
    }

//    // 6.提供对应的set方法
//    public void setBookDao(BookDao bookDao) {
//        this.bookDao = bookDao;
//    }
}
