package edu.nju.booklend.test;

import org.springframework.context.support.GenericXmlApplicationContext;

import edu.nju.booklend.data.domain.Borrower;
import edu.nju.booklend.data.service.AdministratorService;
import edu.nju.booklend.data.service.BorrowerService;
import edu.nju.booklend.data.service.LoginService;

public class bookLendSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:datasource-tx-jpa.xml");
		ctx.refresh();

		AdministratorService administratorService = ctx.getBean(
				"administratorService", AdministratorService.class);

		BorrowerService borrowerService = ctx.getBean(
				"borrowerService", BorrowerService.class);
		
		LoginService loginService=ctx.getBean(
				"loginService", LoginService.class);
		
		Borrower borrower = new Borrower();
		borrower.setId("walker");
		borrower.setPassword("123456");
		borrowerService.add("walker", "123456", 1);
		
		
//		System.out.println(loginService.checkAdministrator("qinzhenning", "123"));

//		List<Administrator> admins = administratorService.findAll();
//		List<BorrowRecord> borrowRecords = borrowRecordService.findAll();


	}

	

}
