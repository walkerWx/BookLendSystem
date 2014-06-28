package edu.nju.booklend.data.service;

import edu.nju.booklend.data.domain.Borrower;

public interface BorrowerService {
	
	public Borrower findById(String id);
	

	//i 0Ϊ������ 1Ϊ�о��� 2Ϊ��ʦ

	public boolean add(String name,String pass,int i);
	
	public boolean delete(String id);


	//i 0Ϊ������ 1Ϊ�о��� 2Ϊ��ʦ

	public boolean updateByName(String name,String pass,int i);
	
	public String findByName(String name);
}
