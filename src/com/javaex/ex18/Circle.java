package com.javaex.ex18;

public class Circle extends Figure implements Drawable {

	//필드
	int radius;

	//생성자
	public Circle() {
	}
	
	public Circle(String fillColor, String lineColor, int radius) {
		super(fillColor, lineColor);
		this.radius = radius;
	}
	
	//메소드-gs
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	//메소드-일반
	@Override
	public String toString() {
		return "Circle [getFillColor()=" + getFillColor() + ", getLineColor()=" + getLineColor() + ", radius=" + radius
				+ "]";
	}
	
	public void draw() {
		System.out.println("면색: "+getFillColor()+" | 선색: "+getLineColor()+" | 반지름: "+radius+"의 원을 그렸습니다.");
	} //interface
	
	public double area() {
		double area = 3.14*radius*radius;
		return area;
	}
	
}