package com.javaex.ex18;

public abstract class Figure { //abstract
	
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
	
	//public abstract void draw();
	//abstract
	//오버라이딩을 위해 제작
	//interface를 위해 주석
	
	public abstract double area();
	//abstract
	//오버라이딩을 위해 제작

}
