package com.bookhub.springbootlibrary.dao;

import com.bookhub.springbootlibrary.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long > {

}
