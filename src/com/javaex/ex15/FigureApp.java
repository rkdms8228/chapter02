package com.javaex.ex15;

public class FigureApp {

	public static void main(String[] args) {
		
		Figure f01 = new Figure("빨강", "노랑");
		System.out.println(f01.toString());
		//f01.draw(); 부모 클래스 주석으로 출력 불가
		
		
		
		//배열 생성
		Ractangle[] rArray = new Ractangle[2];
		Circle[] cArray = new Circle[2];
		Triangle[] tArray = new Triangle[2];
		
		
		
		//사각형 생성
		Ractangle r01 = new Ractangle("빨강", "검정", 4, 4);
		Ractangle r02 = new Ractangle("주황", "검정", 5, 5);
		
		//배열에 사각형 대입
		rArray[0] = r01;
		rArray[1] = r02;
		
		//배열을 이용해서 전체 사각형 출력
		for(int i = 0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		
		
		//원 생성
		Circle c01 = new Circle("보라", "빨강", 3);
		Circle c02 = new Circle("보라", "검정", 3);
				
		//배열에 원 대입
		cArray[0] = c01;
		cArray[1] = c02;
				
		//배열을 이용해서 전체 원 출력
		for(int i = 0; i<cArray.length; i++) {
			cArray[i].draw();
		}
		
		
		
		//삼각형 생성
		Triangle t01 = new Triangle("빨강", "검정", 4, 4);
		Triangle t02 = new Triangle("보라", "검정", 10, 10);
				
		//배열에 원 대입
		tArray[0] = t01;
		tArray[1] = t02;
				
		//배열을 이용해서 전체 원 출력
		for(int i = 0; i<tArray.length; i++) {
			tArray[i].draw();
		}

	}

}
