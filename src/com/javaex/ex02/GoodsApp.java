package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods();
		camera.name = "nikon";
		camera.price = 400000;
		
		Goods notebook = new Goods();
		notebook.name = "LG gram";
		notebook.price = 900000;
		
		Goods cup = new Goods();
		cup.name = "mugcup";
		cup.price = 2000;
		
		System.out.println("상품 이름: "+camera.name+"\t"+"가격: "+camera.price);
		
		System.out.println("상품 이름: "+notebook.name+"\t"+"가격: "+notebook.price);
		
		System.out.println("상품 이름: "+cup.name+"\t"+"가격: "+cup.price);


	}

}
