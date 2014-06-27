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
@Table(name = "t_return_record")
public class ReturnRecord {

	/*
	 * 图书借阅系统归还记录
	 */

	private String id;
	private BorrowRecord borrowRecord;// 归还对应的借阅记录
	DateTime returnDate;// 归还日期

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "return_date")
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@DateTimeFormat(iso = ISO.DATE)
	public DateTime getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(DateTime returnDate) {
		this.returnDate = returnDate;
	}

	@ManyToOne
	@JoinColumn(name = "borrow_id")
	@JsonManagedReference
	public BorrowRecord getBorrowRecord() {
		return borrowRecord;
	}

	public void setBorrowRecord(BorrowRecord borrowRecord) {
		this.borrowRecord = borrowRecord;
	}
}
