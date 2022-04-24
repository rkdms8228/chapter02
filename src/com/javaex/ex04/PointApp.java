package com.javaex.ex04;

public class PointApp {

	public static void main(String[] args) {
		
		Point pointone = new Point();
		pointone.setX(5);
		pointone.setY(5);
		
		Point pointtwo = new Point();
		pointtwo.setX(10);
		pointtwo.setY(23);
		
		Point pointthree = new Point(10, 20);
		
		Point pointfour = new Point(100); //x값
		pointfour.setY(200);
		
		//y값을 먼저 넣고
		//setter x값을 넣으려 할 때 오류
		Point pointfive = new Point(20000); //y값

		pointone.draw();
		pointtwo.draw();
		pointthree.draw();

		/*
		System.out.println("점[X="+pointone.getWide()+", Y="+pointone.getHigh()+"]을 그렸습니다.");
		System.out.println("점[X="+pointtwo.getWide()+", y="+pointtwo.getHigh()+"]을 그렸습니다.");
		*/
		
	}

}
