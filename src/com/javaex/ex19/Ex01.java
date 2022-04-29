package com.javaex.ex19;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double result;
		int num;
		
		num = sc.nextInt();
		
		try {
			
			result = 100/num; //ArithmeticException 예외 상황 발생
			System.out.println(result);
			
		}catch(ArithmeticException e) {
			
			System.out.println("0으로 나눌 수 없습니다.");
			
		}finally {
			
			System.out.println("finally 영역.");
			
		}
		
		sc.close();

	}

}
