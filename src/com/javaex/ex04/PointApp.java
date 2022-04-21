package com.javaex.ex04;

public class PointApp {

	public static void main(String[] args) {
		
		Point pointone = new Point();
		pointone.setWide(5);
		pointone.setHigh(5);
		
		Point pointtwo = new Point();
		pointtwo.setWide(10);
		pointtwo.setHigh(23);
		
		/*
		System.out.println("점[X="+pointone.getWide()+", Y="+pointone.getHigh()+"]을 그렸습니다.");
		System.out.println("점[X="+pointtwo.getWide()+", y="+pointtwo.getHigh()+"]을 그렸습니다.");
		*/

		pointone.draw();
		pointtwo.draw();
		
	}

}
