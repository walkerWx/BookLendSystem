package edu.nju.booklend.data.service;

import java.util.List;

import edu.nju.booklend.data.domain.BorrowRecord;

public interface BorrowRecordService {

	public List<BorrowRecord> findAll();

}
