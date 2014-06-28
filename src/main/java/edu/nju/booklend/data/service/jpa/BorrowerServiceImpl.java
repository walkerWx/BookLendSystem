package edu.nju.booklend.data.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.nju.booklend.data.domain.Borrower;
import edu.nju.booklend.data.repository.BorrowerRepository;
import edu.nju.booklend.data.service.BorrowerService;

@Service("borrowerService")
@Repository
@Transactional
public class BorrowerServiceImpl implements BorrowerService {
	
	@Autowired
	private BorrowerRepository borrowerRepository; 

	@Override
	@Transactional(readOnly=true)
	public Borrower findById(String id) {

		return borrowerRepository.findOne(id);
	}

	@Override
	public boolean add(String name, String pass, int i) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateByName(String name, String pass, int i) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
