package com.javaex.ex16;

public class FigureApp {

	public static void main(String[] args) {
		
		//도형 생성
		Figure f = new Figure("빨강", "노랑");

		//사각형 생성
		Ractangle r = new Ractangle("빨강", "검정", 4, 4);
		System.out.println(r.getWidth()); //자식 메소드 사용 가능
		
		//**메모리에는 다 올라가지만 부모 쪽만 보임(섞어쓰기)**
		//보이지 않더라도 때에 따라서 꺼내 쓸 수 있음! 절대 Figure 단독과 같지 않음
		Figure fr = new Ractangle("빨강", "검정", 4, 4);

		
		
		////////////////////////////////////////////////
		//Figure 배열에 모든 도형을 담아서 관리하고 싶을 때
		
		
		//배열
		Figure[] fArray = new Figure[6];
		
		
		//사각형 생성
		Figure fr01 = new Ractangle("빨강", "검정", 4, 4);
		Figure fr02 = new Ractangle("주황", "검정", 5, 5);
		
		
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
		
		//덮어쓴 상태로 출력됨의 확인 작업(오버라이딩)
		//**무조건 덮어써짐 부모 클래스 무시(부모클래스와 자식 클래스의 메소드 오버라이딩)
		//패키지15는 재정의 패키지16은 오버라이딩 구분 정확히
		System.out.println(fArray[0].toString());
		
		
		//반복문으로 배열에 넣은 도형과 넓이 출력
		for(int i = 0; i<fArray.length; i++) {
			fArray[i].draw();
			System.out.println("도형의 넓이는 "+fArray[i].area()+"입니다.");
			System.out.println();
		}
		
		///////////////////////////////////////////////////////
		//**강제 형변환(타입 변환)으로 가로값 출력(다운캐스팅)
		System.out.println(((Ractangle)fArray[0]).getWidth());
		//괄호로 시선을 바꾸는 작업 먼저 해 주기 중요**
		
		//선색을 모두 보라로 변경하여 확인
		for(int i = 0; i<fArray.length; i++) {
			fArray[i].setLineColor("보라");
		}
		
		for(int i = 0; i<fArray.length; i++) {
			fArray[i].draw();
			System.out.println();
		}

	}

}
