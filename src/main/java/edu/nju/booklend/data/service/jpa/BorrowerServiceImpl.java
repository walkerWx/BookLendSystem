package edu.nju.booklend.data.service.jpa;

import javassist.expr.NewArray;

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
	@Transactional(readOnly = true)
	public Borrower findById(String id) {

		return borrowerRepository.findOne(id);
	}

	@Override
	public boolean add(String name, String pass, int i) {
		// TODO Auto-generated method stub
		Borrower borrower = new Borrower();
		borrower.setId(name);
		borrower.setPassword(pass);
		switch (i) {
		case 0:
			borrower.setIdentity(Borrower.BORROWER_UNDERGRADUATE);
			break;

		case 1:
			borrower.setIdentity(Borrower.BORROWERPOSTGRADUATE);
			break;
		case 2:
			borrower.setIdentity(Borrower.BORROWER_TEACHER);
		default:
			break;
		}

		return borrowerRepository.save(borrower) != null;
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		borrowerRepository.delete(id);
		return borrowerRepository.exists(id);
	}

	@Override
	public boolean updateByName(String name, String pass, int i) {
		// TODO Auto-generated method stub
		Borrower borrower = borrowerRepository.findOne(name);
		borrower.setPassword(pass);
		switch (i) {
		case 0:
			borrower.setIdentity(Borrower.BORROWER_UNDERGRADUATE);
			break;

		case 1:
			borrower.setIdentity(Borrower.BORROWERPOSTGRADUATE);
			break;
		case 2:
			borrower.setIdentity(Borrower.BORROWER_TEACHER);
		default:
			break;
		}

		return borrowerRepository.save(borrower) != null;
	}

	@Override
	public String findByName(String name) {
		// TODO Auto-generated method stub
		Borrower borrower = borrowerRepository.findOne(name);
		return borrower.getId() + "\n" + borrower.getPassword() + "\n"
				+ borrower.getIdentity();
	}

}
