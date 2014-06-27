package edu.nju.booklend.data.service.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.nju.booklend.data.repository.AdministratorRepository;
import edu.nju.booklend.data.service.LoginService;

@Service("loginService")
@Repository
@Transactional
public class LoginServiceImpl implements LoginService {

	@Autowired
	private AdministratorRepository administratorRepository;

	@Override
	public boolean checkAdministrator(String id, String password) {
		// TODO Auto-generated method stub
		return administratorRepository.findByIdAndPassword(id, password).size() != 0;
	}

}
