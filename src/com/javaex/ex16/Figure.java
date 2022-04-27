package com.javaex.ex16;

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
	
	public void draw() {
		System.out.println("면색: "+fillColor+" | 선색: "+lineColor+"의 도형을 그렸습니다.");
	} //부모 클래스가 되면 없는 게 나음 자식 클래스에서 세부 출력 등의 이유로 주석 처리
	//오버라이딩을 위해 주석 제거 덮어쓰기를 위해 만드는 경우도 있음(경력자들 노하우)
	
	public double area() {
		double area = 0;
		return area;
		//return 0; (강사님이 쓰신 내용)
	} //오버라이딩을 위해 제작

}
