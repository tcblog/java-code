package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import com.itheima.dao.BookDao2;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Repository("bookDao2")
public class BookDaoImpl2 implements BookDao {


    public void save(){
        System.out.println("book dao save...22");
    }
}
