package edu.nju.booklend.data.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import edu.nju.booklend.data.domain.Borrower;
import edu.nju.booklend.data.repository.BorrowerRepository;
import edu.nju.booklend.data.service.BorrowerService;

public class BorrowerServiceImpl implements BorrowerService {
	
	@Autowired
	private BorrowerRepository borrowerRepository; 

	@Override
	@Transactional(readOnly=true)
	public Borrower findById(String id) {

		return borrowerRepository.findOne(id);
	}

}
