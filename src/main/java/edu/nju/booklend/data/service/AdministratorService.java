package edu.nju.booklend.data.service;

import java.util.List;

import edu.nju.booklend.data.domain.Administrator;

public interface AdministratorService {
	
	public List<Administrator> findAll();
	public Administrator findById(String id);
}
