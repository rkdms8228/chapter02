package com.javaex.ex10;
//static 사전 조사(스태틱>스택>힙)
public class GoodsApp {
	//필드
	//생성자
	//메소드-gs
	//메소드-일반
	public static void main(String[] args) {

		Goods camera = new Goods("nikon", 400000);
		//System.out.println(camera.getCount());
		System.out.println(camera.toString());
		
		Goods computer = new Goods("LG gram", 900000);
		computer.setName("LG gram");
		computer.setPrice(900000);
		System.out.println(computer.toString());
		
		Goods cup = new Goods("mugcup", 2000);
		System.out.println(cup.toString());

		//System.out.println(camera.count);
		System.out.println(Goods.count); //count 옳은 접근법
		
		/*
		camera.showInfo();
		computer.showInfo();
		cup.showInfo();
		*/

	}

}
