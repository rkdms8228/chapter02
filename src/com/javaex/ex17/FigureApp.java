package com.javaex.ex17;

public class FigureApp {

	public static void main(String[] args) {
		
		//추상클래스 Figure는 메모리에 올라가면 안 됨
		//Figure f = new Figure();
		
		//추상클래스 Figure에는 들어가지 않지만 자식클래스에는 들어감
		Rectangle r = new Rectangle("빨강", "검정", 100, 100);
		
		
		//배열
		Figure[] fArray = new Figure[6];
		
		
		//사각형 생성
		Figure fr01 = new Rectangle("빨강", "검정", 4, 4);
		Figure fr02 = new Rectangle("주황", "검정", 5, 5);
		
		
		//원 생성
		Figure fc01 = new Circle("보라", "빨강", 3);
		Figure fc02 = new Circle("보라", "검정", 3);
		
		
		//삼각형 생성
		Figure ft01 = new Triangle("빨강", "검정", 4, 4);
		Figure ft02 = new Triangle("보라", "검정", 10, 10);
		
		
		//배열에 도형 담기
		fArray[0] = fr01;
		fArray[1] = fr02;
		fArray[2] = fc01;
		fArray[3] = fc02;
		fArray[4] = ft01;
		fArray[5] = ft02;
		
		for(int i = 0; i<fArray.length; i++) {
			fArray[i].draw();
			System.out.println(fArray[i].area());
			System.out.println();
		}

	}

}
