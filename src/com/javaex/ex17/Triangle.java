package com.javaex.ex17;

public class Triangle extends Figure{
	
	//필드
	private int width;
	private int height;
	
	//생성자
	public Triangle() {
	}
	
	public Triangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
	}
	
	//메소드-gs
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	//메소드-일반
	@Override
	public String toString() {
		return "Triangle [getFillColor()=" + getFillColor() + ", getLineColor()=" + getLineColor() + ", width=" + width
				+ ", height=" + height + "]";
	}
	
	public void draw() {
		System.out.println("면색: "+getFillColor()+" | 선색: "+getLineColor()+" | 가로: "+width+" | 세로: "+height+"의 삼각형을 그렸습니다.");
	}
	
	public double area() {
		double area = width*height;
		return area;
	}

}
