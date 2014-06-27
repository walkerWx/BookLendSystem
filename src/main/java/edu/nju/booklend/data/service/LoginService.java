package edu.nju.booklend.data.service;

import edu.nju.booklend.data.domain.Borrower;

public interface LoginService {

	public boolean checkAdministrator(String username, String password);//管理员登录验证
	
	public boolean checkBorrower(String id,String password);//借阅人登录验证
	
}
