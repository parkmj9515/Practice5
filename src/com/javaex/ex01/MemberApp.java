package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

	Member m1 = new Member("정우성","jws",50000);
	
//	m1.setid("jws");
//	m1.setname("정우성");
//	m1.setPoint(50000);
	
	Member m2 = new Member("유재석","yjs",30000);
	
//	m2.setid("yjs");
//	m2.setname("유재석");
//	m2.setPoint(30000);
	
	Member m3 = new Member("이효리","lhr",40000);
	
//	m3.setid("lhr");
//	m3.setname("이효리");
//	m3.setPoint(40000);
//	
	m1.showInfo();
	m2.showInfo();
	m3.showInfo();
	
	}

}
