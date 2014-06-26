package edu.nju.booklend.data.repository;

import org.springframework.data.repository.CrudRepository;

import edu.nju.booklend.data.domain.Administrator;

public interface AdministratorRepository extends
		CrudRepository<Administrator, String> {

}
