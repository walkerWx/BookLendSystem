package edu.nju.booklend.test;

import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import edu.nju.booklend.data.domain.Administrator;
import edu.nju.booklend.data.domain.BorrowRecord;
import edu.nju.booklend.data.service.AdministratorService;
import edu.nju.booklend.data.service.BorrowRecordService;
import edu.nju.booklend.data.service.LoginService;

public class bookLendSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:datasource-tx-jpa.xml");
		ctx.refresh();

		AdministratorService administratorService = ctx.getBean(
				"administratorService", AdministratorService.class);

		BorrowRecordService borrowRecordService = ctx.getBean(
				"borrowRecordService", BorrowRecordService.class);
		
		LoginService loginService=ctx.getBean(
				"loginService", LoginService.class);
		
		System.out.println(loginService.checkAdministrator("qinzhenning", "123"));

		List<Administrator> admins = administratorService.findAll();
		List<BorrowRecord> borrowRecords = borrowRecordService.findAll();


	}

	

}
