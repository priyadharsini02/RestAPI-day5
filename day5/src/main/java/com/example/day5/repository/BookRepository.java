package com.example.day5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day5.entity.BookEntity;

public interface BookRepository extends JpaRepository<BookEntity, Integer>{

}
