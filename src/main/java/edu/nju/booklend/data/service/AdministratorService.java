package edu.nju.booklend.data.service;

import java.util.List;

import edu.nju.booklend.data.domain.Administrator;

public interface AdministratorService {
	
	public List<Administrator> findAll();
	public Administrator findById(String id);
	
	public boolean add(String id,String  name, String pass);
	
	public boolean delete(String id);
	
	//���id ����name, pass
	public boolean update(String id,String  name, String pass);
	
	//���ص�string��ÿ�����Ժ�� /n
	public String find(String id);
}
