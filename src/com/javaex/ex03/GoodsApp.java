package com.javaex.ex03;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods();
		camera.setName("nikon");
		camera.setPrice(400000);
		
		Goods notebook = new Goods();
		notebook.setName("LG gram");
		notebook.setPrice(900000);
		
		Goods cup = new Goods();
		cup.setName("mugcup");
		cup.setPrice(2000);
		
		/* //메소드 - gs(겟터세터) 출력
		System.out.println("상품 이름: "+camera.getName()+"\t"+"금액: "+camera.getPrice());
		System.out.println("상품 이름: "+notebook.getName()+"\t"+"금액: "+notebook.getPrice());
		System.out.println("상품 이름: "+cup.getName()+"\t"+"금액: "+cup.getPrice());
		*/
		
		//메소드 - 일반 출력
		camera.showInfo();
		notebook.showInfo();
		cup.showInfo();

	}

}
