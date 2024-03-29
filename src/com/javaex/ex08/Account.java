package com.javaex.ex08;

public class Account {

    
    private int balance;
    private int deposit;
    private int withdraw;
    private int showBalan;
    
    //생성자 작성
    public void account(int balance,int deposit,int withdraw,int showBalan) {
    	
    	 	this.balance = balance;
     		this.deposit = deposit;
     		this.withdraw = withdraw;
     		this.showBalan = showBalan;
    }
    public void balance() {
    	
    }
    //필요한 메소드 작성
	
	public int getbalance() {
		return balance;
	}
	public void setbalance(int balance) {
		this.balance=balance;
	}
	public int getdeposit() {
		return deposit;
	}
	public void setdeposit(int deposit) {
		this.deposit = deposit;
	}
	
	
}
