package edu.nju.booklend.data.repository;

import org.springframework.data.repository.CrudRepository;

import edu.nju.booklend.data.domain.RenewRecord;

public interface RenewRecordRepository extends
		CrudRepository<RenewRecord, String> {

}
