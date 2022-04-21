package com.javaex.ex04;

public class Point {

	int x;
	int y;
	
	public void setWide(int w) {
		x = w;
	}
	
	public void setHigh(int h) {
		y = h;
	}
	
	public int getWide() {
		return x;
	}
	
	public int getHigh() {
		return y;
	}
	
	public void draw() {
		System.out.println("점[X="+x+", Y="+y+"]을 그렸습니다.");
	}
	
}
