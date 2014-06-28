package edu.nju.booklend.data.service;

import java.util.List;

import edu.nju.booklend.data.domain.BorrowRecord;
import edu.nju.booklend.data.domain.Borrower;

public interface BorrowRecordService {

	public List<BorrowRecord> findAll();
	
	public List<BorrowRecord> findByBorrower(Borrower borrower);
	
	public boolean save(BorrowRecord borrowRecord);
	
	//returnStatus是true改为false,是false改为true
	public boolean updateReturnStatusById(String id);

}
