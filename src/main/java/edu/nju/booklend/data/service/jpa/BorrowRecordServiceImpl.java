package edu.nju.booklend.data.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Lists;

import edu.nju.booklend.data.domain.BorrowRecord;
import edu.nju.booklend.data.repository.BorrowRecordRepository;
import edu.nju.booklend.data.service.BorrowRecordService;

@Service("borrowRecordService")
@Repository
@Transactional
public class BorrowRecordServiceImpl implements BorrowRecordService {

	@Autowired
	private BorrowRecordRepository borrowRecordRepository;

	@Override
	public List<BorrowRecord> findAll() {
		// TODO Auto-generated method stub
		return Lists.newArrayList(borrowRecordRepository.findAll());
	}

}