package com.itheima.mapper;

import com.itheima.book.Book;

import java.util.List;

public interface BooksMapper {

    List<Book> selectAll();
}
