package com.springboot.BookStore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MyBookListEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int MBid;
	private String MBname;
	private String MBauthor;
	private String MBprice;
	public MyBookListEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyBookListEntity(int mBid, String mBname, String mBauthor, String mBprice) {
		super();
		MBid = mBid;
		MBname = mBname;
		MBauthor = mBauthor;
		MBprice = mBprice;
	}
	public int getMBid() {
		return MBid;
	}
	public void setMBid(int mBid) {
		MBid = mBid;
	}
	public String getMBname() {
		return MBname;
	}
	public void setMBname(String mBname) {
		MBname = mBname;
	}
	public String getMBauthor() {
		return MBauthor;
	}
	public void setMBauthor(String mBauthor) {
		MBauthor = mBauthor;
	}
	public String getMBprice() {
		return MBprice;
	}
	public void setMBprice(String mBprice) {
		MBprice = mBprice;
	}
	
	
	

}
