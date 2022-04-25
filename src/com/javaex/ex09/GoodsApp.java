package com.javaex.ex09;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods("nikon", 400000);
		
		Goods computer = new Goods("LG gram", 900000);
		
		Goods cup = new Goods("mugcup", 2000);
		
		Goods[] goodsArray = new Goods[3];
		goodsArray[0] = camera;
		goodsArray[1] = computer;
		goodsArray[2] = cup;
		
		for(int i = 0; i<goodsArray.length; i++) {
			goodsArray[i].showInfo();
		}
		
		System.out.println(goodsArray[0].getName());
		System.out.println(goodsArray[2].getPrice());
		System.out.println(goodsArray[1].toString());
		
		//camera.showInfo();
		//computer.showInfo();
		//cup.showInfo();

	}

}
