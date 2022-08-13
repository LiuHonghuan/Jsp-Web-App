package com.jarvis.honghuan.controller;

import com.jarvis.honghuan.entity.Book;
import com.jarvis.honghuan.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author honghuan.Liu
 * @date 2022/8/13 12:53
 */
@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;


    @RequestMapping("/test")
    public void test() {
        System.out.println("test");
    }

    @RequestMapping("/list")
    public String listAllBook(Model model) {
        List<Book> books = bookService.listAllBook();
        model.addAttribute("list", books);
        return "allBook";
    }

    @RequestMapping("/add")
    public void addBook(Book book) {
        bookService.addBook(book);
    }

    @RequestMapping("/update")
    public void updateBook(Book book) {
        bookService.updateBook(book);
    }

    @RequestMapping("/removeBook")
    public void removeBook(Long id) {
        bookService.removeBook(id);
    }

    @RequestMapping("/get")
    public Book getBook(Long id) {
        return bookService.getBook(id);
    }
}
