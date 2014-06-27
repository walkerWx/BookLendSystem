package edu.nju.booklend.data.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import edu.nju.booklend.data.domain.Book;
import edu.nju.booklend.data.repository.BookRepository;
import edu.nju.booklend.data.service.BookService;

public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Book> findByIsbn(String isbn) {
		// TODO Auto-generated method stub
		return bookRepository.findByIsbn(isbn);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Book> findByBookName(String bookName) {
		// TODO Auto-generated method stub
		return bookRepository.findByBookName(bookName);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Book> findByAuthor(String author) {
		// TODO Auto-generated method stub
		return findByAuthor(author);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Book> findByPublisher(String publisher) {
		// TODO Auto-generated method stub
		return findByPublisher(publisher);
	}

}
