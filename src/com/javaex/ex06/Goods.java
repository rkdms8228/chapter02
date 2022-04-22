package com.javaex.ex06;

public class Goods {
	
	//필드
	private String name;
	private int price;
	
	//생성자
	public Goods() { //기본 생성자
		//*****메모리에 올리는 일(클래스를 인스턴스화)
		System.out.println("Goods()");
	}
	
	public Goods(String name) {
		//*****메모리에 올리는 일(클래스를 인스턴스화)
		//추가 로직
		this.name = name;
		System.out.println("Goods(1)");
	}
	
	/*
	public Goods(int price) {
		//*****메모리에 올리는 일(클래스를 인스턴스화)
		//추가 로직
		this.price = price;
	}
	*/
	
	public Goods(String name, int price) {
		//*****메모리에 올리는 일(클래스를 인스턴스화)
		//추가 로직
		this.name = name;
		this.price = price;
		System.out.println("Goods(2)");
	}
	
	//메소도-gs
	public void setName(String n) {
		this.name = n;
	}
	
	public void setPrice(int p) {
		this.price = p;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	//메소드-일반
	public void showInfo() {
		System.out.println("상품 이름: "+name);
		System.out.println("가격: "+price);
		System.out.println();
	}
	
	@Override
	public String toString() {
		return "Goods [name=" +name+ ", price=" +price+ "]";
	}
	
}
