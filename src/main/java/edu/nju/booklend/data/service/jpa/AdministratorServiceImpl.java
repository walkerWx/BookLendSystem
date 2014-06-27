package edu.nju.booklend.data.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Lists;

import edu.nju.booklend.data.domain.Administrator;
import edu.nju.booklend.data.repository.AdministratorRepository;
import edu.nju.booklend.data.service.AdministratorService;

@Service("administratorService")
@Repository
@Transactional
public class AdministratorServiceImpl implements AdministratorService {

	@Autowired
	private AdministratorRepository administratorRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Administrator> findAll() {
		// TODO Auto-generated method stub
		return Lists.newArrayList(administratorRepository.findAll());
	}
	
	@Override
	@Transactional(readOnly=true)
	public Administrator findById(String id){
		return administratorRepository.findOne(id);
	}

	@Override
	public boolean add(String id, String name, String pass) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(String id, String name, String pass) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String find(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
