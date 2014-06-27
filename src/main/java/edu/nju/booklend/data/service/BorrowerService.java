package edu.nju.booklend.data.service;

import edu.nju.booklend.data.domain.Borrower;

public interface BorrowerService {
	
	public Borrower findById(String id);
	
	//i 0为本科生 1为研究生 2为教师
	public boolean add(String name,String pass,int i);
	
	public boolean delete(String id);

	//i 0为本科生 1为研究生 2为教师
	public boolean updateByName(String name,String pass,int i);
	
	public String findByName(String name);
}
