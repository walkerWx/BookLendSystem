package edu.nju.booklend.data.repository;

import org.springframework.data.repository.CrudRepository;

import edu.nju.booklend.data.domain.Book;

public interface BookRepository extends CrudRepository<Book, String> {

}
