package edu.nju.booklend.data.domain;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_borrower")
public class Borrower {

	/*
	 * 图书借阅系统借阅人
	 */

	public final static String BORROWER_TEACHER = "teacher";
	public final static String BORROWER_UNDERGRADUATE = "undergraduate";
	public final static String BORROWERPOSTGRADUATE = "postgraduate";

	private String id;
	private String password;
	private String identity;// 借阅人身份，为teacher,undergraduate,postgraduate一种

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "identity")
	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

}
