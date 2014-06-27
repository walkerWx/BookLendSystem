package edu.nju.booklend.data.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import edu.nju.booklend.data.domain.Book;

public interface BookRepository extends CrudRepository<Book, String> {

	public List<Book> findByIsbn(String isbn);

	public List<Book> findByBookName(String bookName);

	public List<Book> findByAuthor(String author);

	public List<Book> findByPublisher(String publisher);
	
}
