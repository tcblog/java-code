package com.itheima;

import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import com.itheima.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // 1.加载类路径下的配置文件
        ApplicationContext ctx = new FileSystemXmlApplicationContext("E:\\java_code\\sping-01\\src\\main\\resources\\applicationContext.xml");
        BookDao bookDao = ctx.getBean("bookDao",BookDao.class);
        bookDao.save();
    }
}
