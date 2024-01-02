package com.books.mvcOne.service;


import com.books.mvcOne.model.Books;
import com.books.mvcOne.repo.BooksRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private  final BooksRepo booksRepo;

    @Autowired
    public BookService(BooksRepo booksRepo) {
        this.booksRepo = booksRepo;
    }


    public List<Books> getAllBooks() {
        return booksRepo.findAll();
    }

    public void addBook(Books books) {
    booksRepo.save(books);
    }

    public Books findbyId(Long id) {
    Optional<Books> optionalBooks=booksRepo.findById(id);
    return optionalBooks.get();
    }
}
