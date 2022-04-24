package com.javaex.ex06;

public class GoodsApp {

	public static void main(String[] args) {
		
		//Goods notebook = new Goods("LG gram", 900000);
		//Goods camera = new Goods("nikon", 400000);
		
		Goods notebook = new Goods("LG gram", 900000);
		
		/*
		Goods notebook = new Goods();
		notebook.setName("LG gram");
		notebook.setPrice(900000);
		*/
		
		Goods camera = new Goods("nikon");
		camera.setPrice(400000);
		
		Goods cup = new Goods();
		cup.setName("mugcup");
		cup.setPrice(2000);
		
		//System.out.println(notebook.toString());
		//System.out.println(camera.toString());
		//System.out.println(cup.toString());
		
		notebook.showInfo();
		camera.showInfo();
		cup.showInfo();

	}

}
