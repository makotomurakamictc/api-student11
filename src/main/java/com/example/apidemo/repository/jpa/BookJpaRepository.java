package com.example.apidemo.repository.jpa;

import com.example.apidemo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookJpaRepository extends JpaRepository<Book, String> {
    Book findBookById(final String id);
}