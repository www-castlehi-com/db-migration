package com.example.dbmigration.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "BOOK")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255)
    private String title;

    @Column(nullable = false, length = 100)
    private String author;

    @Column(nullable = false, length = 50)
    private String category;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false, length = 20)
    private String isbn;

    protected Book() {}

    public Book(String title, String author, String category, String isbn) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.createdAt = LocalDateTime.now();
        this.isbn = isbn;
    }

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getCategory() { return category; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public String getIsbn() { return isbn; }
}
