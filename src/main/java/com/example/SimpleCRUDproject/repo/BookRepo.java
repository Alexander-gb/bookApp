package com.example.SimpleCRUDproject.repo;

import com.example.SimpleCRUDproject.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface BookRepo extends JpaRepository<Book,Long> {
}
