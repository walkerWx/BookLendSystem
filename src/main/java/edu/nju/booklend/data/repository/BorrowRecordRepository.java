package edu.nju.booklend.data.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import edu.nju.booklend.data.domain.BorrowRecord;
import edu.nju.booklend.data.domain.Borrower;

public interface BorrowRecordRepository extends
		CrudRepository<BorrowRecord, String> {

	List<BorrowRecord> findByBorrower(Borrower borrower);

}
