package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.dao.UserDao;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Service
public class BookServiceImpl implements BookService {
    // 自动装配（注入依赖）
    @Autowired
    @Qualifier("bookDao1")
    private BookDao bookDao;

    public void  save(){
        System.out.println("book service save...");
        bookDao.save();
    }


}
