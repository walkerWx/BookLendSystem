package edu.nju.booklend.data.service;

import java.util.List;

public interface MessageService {

	// 察看图书到期提醒
	public List<String> getBookDueTimeMessage(String id);

	// 察看提前还书通知
	public List<String> getReturnBookInAdvanceMessage(String id);

}
