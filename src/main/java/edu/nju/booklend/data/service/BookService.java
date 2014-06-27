package edu.nju.booklend.data.service;

import java.util.List;

import edu.nju.booklend.data.domain.Book;

public interface BookService {
	
	public List<Book> findByIsbn(String isbn); 
	
	public List<Book> findByBookName(String bookName); 
	
	public List<Book> findByAuthor(String author); 
	
	public List<Book> findByPublisher(String publisher); 
	
	//type  0为是珍本  1为否
	public boolean add(String id,String isbn,String name,String author,String publish,String year,int num,int type);
	
	public boolean delete(String id);
	
	//type  0为是珍本  1为否,根据ID修改其他信息
	public boolean update(String id,String isbn,String name,String author,String publish,String year,int num,int type);

	//每个属性后+ /n
	public String find(String id);
}
