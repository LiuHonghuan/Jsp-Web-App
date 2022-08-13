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


    @RequestMapping("/list")
    public String listAllBook(Model model) {
        List<Book> books = bookService.listAllBook();
        model.addAttribute("bookList", books);
        return "allBook";
    }

    @RequestMapping("/add")
    public String addBook(Book book) {
        bookService.addBook(book);
        return "redirect:/book/list";
    }

    @RequestMapping("/addPage")
    public String addBookPage() {
        return "addPage";
    }

    @RequestMapping("/update")
    public String updateBook(Book book) {
        bookService.updateBook(book);
        return "redirect:/book/list";
    }

    @RequestMapping("/updatePage")
    public String updateBook(Model model, Long id) {
        Book book = bookService.getBook(id);
        model.addAttribute("book", book);
        return "updateBook";
    }

    @RequestMapping("/removeBook")
    public String removeBook(Long id) {
        bookService.removeBook(id);
        return "redirect:/book/list";
    }

    @RequestMapping("/get")
    public Book getBook(Long id) {
        return bookService.getBook(id);
    }
}
