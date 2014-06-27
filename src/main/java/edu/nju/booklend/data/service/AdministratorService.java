package edu.nju.booklend.data.service;

import java.util.List;

import edu.nju.booklend.data.domain.Administrator;

public interface AdministratorService {
	
	public List<Administrator> findAll();
	public Administrator findById(String id);
	
	public boolean add(String id,String  name, String pass);
	
	public boolean delete(String id);
	
	//根据id 更新name, pass
	public boolean update(String id,String  name, String pass);
	
	//返回的string在每个属性后加 /n
	public String find(String id);
}
