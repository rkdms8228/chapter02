package com.javaex.ex18;

public class FigureApp {

	public static void main(String[] args) {
		
		//interface 구현 후 실험
		/*
		//point 생성
		Point p01 = new Point(30, 20);
		p01.draw();
		
		//섞어쓰기
		Drawable dp01 = new Point(100, 100);
		dp01.draw(); //오버라이드라고 하지 않음 | 원래 인터페이스의 성질(원리 같음)
		//dp01.getX(); *없음*
		
		Ractangle r01 = new Ractangle("빨강", "검정", 1, 1);
		r01.draw();
		r01.area();
		
		
		Figure fr01 = new Ractangle("빨강", "검정", 5, 5);
		//fr01.draw(); X 쓸 수 없음 | 보이지 않음
		fr01.area();
		
		Drawable d01 = new Ractangle("빨강", "검정", 5, 5);
		d01.draw();
		//d01.area(); X 쓸 수 없음 | 보이지 않음
		*/
		
		/////////////////////////////////////////////////
		//interface 구현 후 제대로 된 출력
		
		//배열 선언
		Drawable[] dArray = new Drawable[4];
		
		
		//사각형 선언
		Drawable r01 = new Ractangle("빨강", "검정", 1, 1);
		//원 선언
		Drawable c01 = new Circle("파랑", "검정", 3);
		//삼각형 선언
		Drawable t01 = new Triangle("주황", "검정", 5, 5);
		//point 선언
		Drawable p01 = new Point(8, 8);
		
		
		//배열에 넣기
		dArray[0] = r01;
		dArray[1] = c01;
		dArray[2] = t01;
		dArray[3] = p01;
		
		
		//반복문으로 출력
		for(int i = 0; i<dArray.length; i++) {
			dArray[i].draw();
		}
		
		
		//사각형의 가로값
		System.out.println(((Ractangle)dArray[0]).getWidth());
		
		//사각형의 면의 색
		System.out.println(((Ractangle)dArray[0]).getFillColor());
		
		System.out.println("===================================");
		//////////////////////////////////////////////////////
		//배열의 면적 구하기
		/*
		//point는 area를 가지고 있지 않음 해서 마지막 값 오류뜸
		for(int i = 0; i<dArray.length; i++) {
			double area = (((Figure)dArray[i]).area());
			System.out.println(area);
		}
		*/
		
		for(int i = 0; i<dArray.length; i++) {
			
			if(dArray[i] instanceof Figure == true) {
				System.out.println(((Figure)dArray[i]).area());

			}
			
		}
		
		
		
	}

}
