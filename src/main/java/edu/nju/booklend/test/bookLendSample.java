package edu.nju.booklend.test;

import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import edu.nju.booklend.data.domain.Administrator;
import edu.nju.booklend.data.domain.BorrowRecord;
import edu.nju.booklend.data.service.AdministratorService;
import edu.nju.booklend.data.service.BorrowRecordService;

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

		List<Administrator> admins = administratorService.findAll();
		List<BorrowRecord> borrowRecords = borrowRecordService.findAll();

		System.out.println(borrowRecords.get(0).getBook().getAuthor());
//		listAdmins(admins);

	}

	private static void listAdmins(List<Administrator> admins) {
		System.out.println(admins.get(0).getRealname() + admins.get(0).getId()
				+ admins.get(0).getPassword() + admins.get(0).getTelephone());
	}

}
