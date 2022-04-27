package com.javaex.ex15;

public class Ractangle extends Figure{
	
	//필드
	private int width;
	private int height;
	
	//생성자
	public Ractangle() {
	}
	
	public Ractangle(String fillColor, String lineColor, int width, int height) {
		//super(fillColor, lineColor); 디폴트 생성자
		super.fillColor = fillColor;
		super.lineColor = lineColor;
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
		return "Ractangle [getFillColor()=" + super.fillColor + ", getLineColor()=" + this.getLineColor() + ", width=" + width
				+ ", height=" + height + "]";
	}
	
	public void draw() {
		System.out.println("면색: "+super.fillColor+" | 선색: "+this.lineColor+" | 가로: "+width+" | 세로: "+height+"의 사각형을 그렸습니다.");
	}

}
