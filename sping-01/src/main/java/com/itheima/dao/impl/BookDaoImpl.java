package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import com.itheima.service.BookService;

public class BookDaoImpl implements BookDao {
    private int connectionNumber;

    public void setConnectionNumber(int connectionNumber) {
        this.connectionNumber = connectionNumber;
    }

    public void save(){
        System.out.println("book dao save..." + this.connectionNumber);
    }
}
