package com.user.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reader {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer subscriptionId;
	
	Integer userId;
	Integer bookId;
	String email;
	
	
	public Integer getSubscriptionId() {
		return subscriptionId;
	}
	public void setSubscriptionId(Integer subscriptionId) {
		this.subscriptionId = subscriptionId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Reader(Integer subscriptionId, Integer userId, Integer bookId, String email) {
		super();
		this.subscriptionId = subscriptionId;
		this.userId = userId;
		this.bookId = bookId;
		this.email = email;
	}
	public Reader() {
		super();
	}

	@Override
	public String toString() {
		return "Reader{" +
				"subscriptionId=" + subscriptionId +
				", userId=" + userId +
				", bookId=" + bookId +
				", email='" + email + '\'' +
				'}';
	}
}
