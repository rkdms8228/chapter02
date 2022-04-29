package com.javaex.ex19;

public class Ex02 {

	public static void main(String[] args) {
		
		int[] intArray = new int[3];
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;
		
		try {
			System.out.println(intArray[3]);
		} catch ( ArrayIndexOutOfBoundsException e ) { 
			System.out.println(e.getMessage());
		} finally { //생략 가능
			System.out.println("종료.");
		}

	}

}
