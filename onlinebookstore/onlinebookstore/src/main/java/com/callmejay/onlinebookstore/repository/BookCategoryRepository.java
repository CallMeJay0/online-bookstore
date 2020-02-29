package com.callmejay.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.callmejay.onlinebookstore.entity.BookCategory;



public interface BookCategoryRepository extends JpaRepository<BookCategory, Long>{

}
