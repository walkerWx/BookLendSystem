package edu.nju.booklend.data.repository;

import java.util.List;


import org.springframework.data.repository.CrudRepository;

import edu.nju.booklend.data.domain.Borrower;

public interface BorrowerRepository extends CrudRepository<Borrower, String> {

	public List<Borrower> findByIdAndPassword(String id, String password);

}
