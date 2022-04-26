package com.javaex.ex13;

public class ColorPoint extends Point{
	
	//필드
	private String color;
	
	//생성자
	public ColorPoint() {
	}
	
	public ColorPoint(String color) {
		this.color = color;
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	//메소드-gs
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//메소드-일반
	@Override
	public String toString() {
		return "ColorPoint [color=" + color + "]";
	}
	
	public void showInfo() {
		System.out.println("점X: "+x+", 점Y: "+y+", 색: "+color);
	}

}
