package edu.nju.booklend.data.repository;

import org.springframework.data.repository.CrudRepository;

import edu.nju.booklend.data.domain.BorrowRecord;

public interface BorrowRecordRepository extends
		CrudRepository<BorrowRecord, String> {

}
