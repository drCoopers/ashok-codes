package com.books.mvcOne.controller;

import com.books.mvcOne.model.Books;
import com.books.mvcOne.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.awt.print.Book;
import java.util.List;

@Controller
@RequestMapping("/api/v1/book")
public class BookController {

    @Autowired
    private  BookService bookService;

    @GetMapping("/get")
    public ModelAndView getBook(){
        ModelAndView modelAndView=new ModelAndView();
        List<Books> booksList= bookService.getAllBooks();
        modelAndView.addObject("books",booksList);
        modelAndView.setViewName("books-view");
        printMethod(modelAndView, booksList);
        return modelAndView;
    }

    private static void printMethod(ModelAndView modelAndView, List<Books> booksList) {
        System.out.println(modelAndView.getViewName());
        System.out.println(modelAndView.getModelMap());
        booksList.forEach(System.out::println);
    }

    @GetMapping("/add")
    public ModelAndView showAddBookPage(){
        ModelAndView modelAndView= new ModelAndView();
        modelAndView.setViewName("add-book");
        modelAndView.addObject("books",new Books());
        return modelAndView;
    }

    @PostMapping(value = "/add/data")
    public ModelAndView addData(Books books) {
        bookService.addBook(books);
        ModelAndView modelAndView = new ModelAndView();
        List<Books> booksList = bookService.getAllBooks();
        modelAndView.addObject("books", booksList);
        modelAndView.setViewName("books-view");
        printMethod(modelAndView, booksList);
        return modelAndView;
    }

    @GetMapping("/show/edit/")
    public  ModelAndView showEditPage(@RequestParam("id")  Long id){
        Books book= bookService.findbyId(id);
        System.out.println(book);
        ModelAndView modelAndView= new ModelAndView();
        modelAndView.setViewName("edit-page");
        modelAndView.addObject("book",book);
        System.out.println("Model vew is "+ modelAndView);
        return modelAndView;
    }


    @GetMapping("/delete/")
    public ModelAndView deleteById(@RequestParam("id")  Long id){
        bookService.deleteById(id);
        ModelAndView modelAndView = new ModelAndView();
        List<Books> booksList = bookService.getAllBooks();
        modelAndView.addObject("books", booksList);
        modelAndView.setViewName("books-view");
        printMethod(modelAndView, booksList);
        return modelAndView;
    }

    @PostMapping("/show/edit/add")
    public ModelAndView editAdd( Books books){
        Books books1=bookService.findbyId(books.getId());
        books1.setAuthor(books.getAuthor());
        books1.setName(books.getName());
        books1.setPrice(books.getPrice());
        bookService.addBook(books1);
        ModelAndView modelAndView = new ModelAndView();
        List<Books> booksList = bookService.getAllBooks();
        modelAndView.addObject("books", booksList);
        modelAndView.setViewName("books-view");
        printMethod(modelAndView, booksList);
        return modelAndView;
    }
}