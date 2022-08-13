package com.jarvis.honghuan.service;

import com.jarvis.honghuan.entity.Book;

import java.util.List;

/**
 * @author honghuan.Liu
 * @date 2022/8/13 17:22
 */
public interface BookService {

    List<Book> listAllBook();

    void addBook(Book book);

    void updateBook(Book book);

    void removeBook(Long id);

    Book getBook(Long id);
}
