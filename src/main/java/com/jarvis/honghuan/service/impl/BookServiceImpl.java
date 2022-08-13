package com.jarvis.honghuan.service.impl;

import com.jarvis.honghuan.entity.Book;
import com.jarvis.honghuan.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author honghuan.Liu
 * @date 2022/8/13 15:54
 */
@Service
public class BookServiceImpl implements BookService {

    private List<Book> bookListCache = new ArrayList<>();


    @PostConstruct
    public void initData() {
        for (int i = 1; i < 6; i++) {
            Book book = new Book();
            book.setId(Long.valueOf(i));
            book.setCount(i * 2);
            book.setName("书名" + i);
            book.setNote(UUID.randomUUID().toString());
            bookListCache.add(book);
        }
    }

    @Override
    public List<Book> listAllBook() {
        return bookListCache;
    }

    @Override
    public Book getBook(Long id){
        Map<Long, Book> bookMap = bookListCache.stream().collect(Collectors.toMap(Book::getId, k -> k));
        return bookMap.get(id);
    }

    @Override
    public void addBook(Book book) {
        Long maxId = bookListCache.stream().map(Book::getId).max(Comparator.comparing(k -> k)).stream().findFirst().get();
        book.setId(maxId + 1);
        bookListCache.add(book);
    }

    @Override
    public void updateBook(Book book) {
        Map<Long, Book> bookMap = bookListCache.stream().collect(Collectors.toMap(Book::getId, k -> k));
        Book book1 = bookMap.get(book.getId());
        if (Objects.nonNull(book1)) {
            bookListCache.remove(book1);
            bookListCache.add(book);
        }
    }

    @Override
    public void removeBook(Long id){
        Map<Long, Book> bookMap = bookListCache.stream().collect(Collectors.toMap(Book::getId, k -> k));
        Book book1 = bookMap.get(id);
        if (Objects.nonNull(book1)) {
            bookListCache.remove(book1);
        }
    }

}
