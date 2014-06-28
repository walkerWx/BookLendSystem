package edu.nju.booklend.data.service.jpa;

import org.springframework.stereotype.Repository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.nju.booklend.data.domain.BorrowRecord;
import edu.nju.booklend.data.service.RenewRecordService;

@Service("renewRecordService")
@Repository
@Transactional
public class RenewRecordServiceImpl implements RenewRecordService {

	@Override
	@Transactional(readOnly=true)
	public boolean renewBook(BorrowRecord borrowRecord) {
		// TODO Auto-generated method stub
		return false;
	}

}
