package edu.nju.booklend.data.repository;

import org.springframework.data.repository.CrudRepository;

import edu.nju.booklend.data.domain.ReturnRecord;

public interface ReturnRecordRepository extends
		CrudRepository<ReturnRecord, String> {

}
