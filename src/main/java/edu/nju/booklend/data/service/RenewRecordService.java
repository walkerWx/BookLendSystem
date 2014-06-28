package edu.nju.booklend.data.service;

import edu.nju.booklend.data.domain.BorrowRecord;


public interface RenewRecordService {
	
	
	//图书每次借阅时间为30天，本科生和研究生可以续借1次，教师可以续借2次。
	//超期的图书和被教师请求的图书不得续借。
	//
	public boolean renewBook(BorrowRecord borrowRecord);

}
