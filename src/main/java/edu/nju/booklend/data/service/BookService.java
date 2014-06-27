package edu.nju.booklend.data.service;

import java.util.List;

import edu.nju.booklend.data.domain.Book;

public interface BookService {
	
	public List<Book> findByIsbn(String isbn); 
	
	public List<Book> findByBookName(String bookName); 
	
	public List<Book> findByAuthor(String author); 
	
	public List<Book> findByPublisher(String publisher); 

}
