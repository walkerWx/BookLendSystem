package edu.nju.booklend.data.domain;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonManagedReference;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name = "t_borrow_record")
public class BorrowRecord {

	/*
	 * 图书借阅系统图书借阅记录
	 */

	private String id;
	private Book book;
	private Borrower borrower;// 借阅人
	private DateTime borrowDate;// 借阅日期
	private int borrowDays;// 借阅时间
	private boolean returnStatus;// 是否归还

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "borrow_date")
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@DateTimeFormat(iso = ISO.DATE)
	public DateTime getBorrowDate() {
		return borrowDate;
	}

	public void setBorrowDate(DateTime borrowDate) {
		this.borrowDate = borrowDate;
	}

	@Column(name = "borrow_days")
	public int getBorrowDays() {
		return borrowDays;
	}

	public void setBorrowDays(int borrowDays) {
		this.borrowDays = borrowDays;
	}

	@Column(name = "return_status")
	public boolean isReturnStatus() {
		return returnStatus;
	}

	public void setReturnStatus(boolean returnStatus) {
		this.returnStatus = returnStatus;
	}

	@ManyToOne
	@JoinColumn(name = "book_id")
	@JsonManagedReference
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@ManyToOne
	@JoinColumn(name = "borrower_id")
	@JsonManagedReference
	public Borrower getBorrower() {
		return borrower;
	}

	public void setBorrower(Borrower borrower) {
		this.borrower = borrower;
	}
}
