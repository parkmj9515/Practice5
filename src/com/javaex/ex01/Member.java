package com.javaex.ex01;

public class Member {

	private String id;
	private String name;
	private int Point;
	
public Member(String id,String name,int Point) {
		
		
		this.id = id;
		this.name = name;
		this.Point = Point;
	}
	
	
	
// getter	
	public  String getid() {
		return id;
	}public String getname() {
		return name;
	}public int getPoint() {
		return Point;
	}
	
// setter
	public void setid(String id) {
		this.id = id;
	}public void setname(String name) {
		this.name = name;
	}public void setPoint(int Point) {
		this.Point = Point;
	}
	public void showInfo() {
		System.out.printf("회원정보:%s(%s),%d점%n",name,id,Point);
}
}
