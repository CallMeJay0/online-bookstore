package com.callmejay.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.callmejay.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
