package edu.nju.booklend.data.service;

import java.util.List;

import edu.nju.booklend.data.domain.Book;

public interface BookService {
	
	public List<Book> findByIsbn(String isbn); 
	
	public List<Book> findByBookName(String bookName); 
	
	public List<Book> findByAuthor(String author); 
	
	public List<Book> findByPublisher(String publisher); 
	

	//type  0Ϊ���䱾  1Ϊ��
	public boolean add(String id,String isbn,String name,String author,String publish,String year,int num,int type);
	
	public boolean delete(String id);
	

	public boolean update(String id,String isbn,String name,String author,String publish,String year,int num,int type);


	//ÿ�����Ժ�+ /n

	public String find(String id);
}
