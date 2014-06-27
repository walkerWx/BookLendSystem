package edu.nju.booklend.data.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import edu.nju.booklend.data.repository.AdministratorRepository;
import edu.nju.booklend.data.repository.BorrowerRepository;
import edu.nju.booklend.data.service.LoginService;

@Service("loginService")
@Repository
@Transactional
public class LoginServiceImpl implements LoginService {

	@Autowired
	private AdministratorRepository administratorRepository;
	
	@Autowired
	private BorrowerRepository borrowerRepository;
	

	@Override
	public boolean checkAdministrator(String username, String password) {
		// TODO Auto-generated method stub
		return administratorRepository.findByUsernameAndPassword(username, password).size() != 0;
	}

	@Override
	public boolean checkBorrower(String id, String password) {
		
		return borrowerRepository.findByIdAndPassword(id,password).size() != 0;
	}

}
