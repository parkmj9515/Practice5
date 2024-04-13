package com.javaex.ex10;

public class Book {
    
    private int bookNo;
    private int stateCode;
    private String title;
    private String author;
    
    public Book(int bookNo, String title,String author) {
		
		//	객체 초기화를 담당
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		stateCode = 1;
	}
    public void rent() {
    	stateCode = 0;
    }
    
    public void print() {
    	if(stateCode == 0) {
    		System.out.println(bookNo + "책제목" + title+ "책 저자: " + author +
    				"대여 유무: 대여중");
    	}else {
    		System.out.println(bookNo + "책제목" + title+ "책 저자: " + author +
    				"대여 유무: 재고 있음");
    	}
    }
   
}
