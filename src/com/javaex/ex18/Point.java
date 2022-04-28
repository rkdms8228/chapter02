package com.javaex.ex18;

public class Point implements Drawable {
	
	//필드
	private int X;
	private int Y;
	
	//생성자
	public Point() {
	}
	
	public Point(int X, int Y) {
		this.X = X;
		this.Y = Y;
	}

	//메소드-gs 
	public int getX() {
		return X;
	}

	public void setX(int x) {
		X = x;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		Y = y;
	}
	
	//메소드-일반
	@Override
	public String toString() {
		return "Point [X=" + X + ", Y=" + Y + "]";
	}
	
	public void draw() {
		System.out.println("점X: "+X+" | 점Y: "+Y+"의 점을 그렸습니다.");
	}

}
