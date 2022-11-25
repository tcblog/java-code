package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {


    public void save(){
        System.out.println("book dao save...11");
    }
}
