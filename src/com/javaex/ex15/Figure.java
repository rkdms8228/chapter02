package com.javaex.ex15;

public class Figure {
	
	//필드
	protected String fillColor;
	protected String lineColor;
	
	//생성자
	public Figure() {
	}
	
	public Figure(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}
	
	//메소드-gs
	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	//메소드-일반
	@Override
	public String toString() {
		return "Figure [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	
	/*
	public void draw() {
		System.out.println("면색: "+fillColor+" | 선색: "+lineColor+"의 도형을 그렸습니다.");
	} 부모 클래스가 되면 없는 게 나음
	*/

}
