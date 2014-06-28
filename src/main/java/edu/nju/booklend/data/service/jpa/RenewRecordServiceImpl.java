package edu.nju.booklend.data.service.jpa;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.nju.booklend.data.domain.BorrowRecord;
import edu.nju.booklend.data.domain.Borrower;
import edu.nju.booklend.data.service.RenewRecordService;

@Service("renewRecordService")
@Repository
@Transactional
public class RenewRecordServiceImpl implements RenewRecordService {

	@Override
	public boolean renewBook(BorrowRecord borrowRecord) {
		// TODO Auto-generated method stub
		Borrower borrower = borrowRecord.getBorrower();
		if (borrower.getIdentity().equals(Borrower.BORROWER_TEACHER)) {

		} else {

		}

		return false;

	}

}
