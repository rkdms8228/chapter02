package com.javaex.ex04;

public class Point {

	//필드
	int x;
	int y;
	
	//생성자
	public Point() {
		//메모리에 올리는 일
	}
	
	public Point(int x) {
		//메모리에 올리는 일
		this.x = x;
	}
	
	public Point(int x, int y) {
		//메모리에 올리는 일
		this.x = x;
		this.y = y;
	}
	
	//메소드(메소드 안에서만 if 쓸 수 있음)-gs
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void draw() {
		System.out.println("점[X="+x+", Y="+y+"]을 그렸습니다.");
	}
	
}
