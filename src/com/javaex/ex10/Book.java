package com.javaex.ex10;

public class Book {
    
    private int bookNo;
    private int stateCode;
    private String title;
    private String author;
    
    public Book(int bookNo,int stateCode, String title,String author) {
		
		//	객체 초기화를 담당
		this.bookNo = bookNo;
		this.stateCode = stateCode;
		this.title = title;
		this.author = author;
	}
    
    //getter
    public int getBookNo() {
    	return bookNo;
    }
    public int getStateCode() {
    	return stateCode;
    }
    public String getTitle() {
    	return title;
    }
    public String getAuthor() {
    	return author;
    }
    
    // setter
    public void setBookNo(int bookNo) {
    	this.bookNo= bookNo;
    }
    public void setStateCode(int stateCode) {
    	this.stateCode= stateCode;
    }
    public void setTitle(String title) {
    	this.title= title;
    }
    public void setAuthor(String author) {
    	this.author= author;
    }
    
    public void rent() {
    	System.out.println();
    }
}
