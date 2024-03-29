package com.javaex.ex02;

public class Goods {
	
	private String name;
	private int price;
	private String camera;
	

	public Goods(String name,int price) {
		this.name = name;
		this.price = price;
	}
	
	
	public String getCamera() {
		return camera;
	}
	public void setCamera(String camera) {
		this.camera= camera;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("상품명:" + name + ",가격:"+price);
		//		System.out.printf("%s, %,d원%n",
//				 camera.camera,
//				 camera.price2);
	}
}




