package edu.nju.booklend.data.repository;

import org.springframework.data.repository.CrudRepository;

import edu.nju.booklend.data.domain.Borrower;

public interface BorrowerRepository extends CrudRepository<Borrower, String> {

}
