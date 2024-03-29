package com.javaex.ex05;

import com.javaex.ex07.Friend;

public class Print {
    
    public void printer(int val){
        System.out.println(val);
    }
  //메소드  3개 를 작성하세요
    public void printer(boolean bDraw) {
    	System.out.println(bDraw);
	}
    public void printer(double i){
        System.out.println(i);
    }
    public void printer(String name){
        System.out.println(name);
    }

 
    private int num;
    private boolean bDraw;
    private double i;
    private String name;
 
// getter
    public int getnum() {
		return num;
	}

    public double geti() {
		return i;
	}
    public String getName() {
		return name;
	}
    
 // setter
    public void setnum(int num) {
		this.num = num;
	}
    public void set(boolean bDraw) {
		this.bDraw = bDraw;
	}
    public void seti(double i) {
		this.i = i;
	}
    public void setName(String name) {
		this.name = name;
	}
  
}