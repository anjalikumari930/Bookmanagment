package com.bookmanagment.bookmanagment.repository;

import com.bookmanagment.bookmanagment.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByTitleContaining(String title); // Search by title

    List<Book> findByAuthorContaining(String author); // Search by author

    List<Book> findByOrganisationContaining(String organisation);
}
