package com.example.dbmigration.repository;

import com.example.dbmigration.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class BookRepositoryTest {

    @Autowired
    private BookRepository bookRepository;

    @Test
    void saveAndFind() {
        Book book = new Book("테스트 도서", "테스트 저자", "TECH", "978-0-00-000000-0");
        Book saved = bookRepository.save(book);

        Book found = bookRepository.findById(saved.getId()).orElseThrow();

        assertThat(found.getTitle()).isEqualTo("테스트 도서");
        assertThat(found.getIsbn()).isEqualTo("978-0-00-000000-0");
    }
}
