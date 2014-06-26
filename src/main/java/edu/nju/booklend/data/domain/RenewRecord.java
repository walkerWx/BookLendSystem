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
@Table(name = "t_renew_record")
public class RenewRecord {

	/*
	 * 图书借阅系统续借记录
	 */

	private String id;
	private BorrowRecord borrowRecord;// 续借对应的借阅记录
	int renewCount;// 续借次数
	DateTime renewDate;// 续借日期
	int renewDays;// 续借天数

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "renew_count")
	public int getRenewCount() {
		return renewCount;
	}

	public void setRenewCount(int renewCount) {
		this.renewCount = renewCount;
	}

	@Column(name = "renew_date")
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@DateTimeFormat(iso = ISO.DATE)
	public DateTime getRenewDate() {
		return renewDate;
	}

	public void setRenewDate(DateTime renewDate) {
		this.renewDate = renewDate;
	}

	@Column(name = "renew_days")
	public int getRenewDays() {
		return renewDays;
	}

	public void setRenewDays(int renewDays) {
		this.renewDays = renewDays;
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
