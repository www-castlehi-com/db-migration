package com.example.dbmigration.repository;

import com.example.dbmigration.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
