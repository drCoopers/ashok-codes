package com.books.mvcOne.repo;

import com.books.mvcOne.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepo  extends JpaRepository<Books,Long> {

}
