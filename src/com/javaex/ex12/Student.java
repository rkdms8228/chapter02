package com.javaex.ex12;

public class Student extends Person{
	
	//필드
	private String schoolName;

	//생성자
	public Student() {
		//super(); 생략되어 있음(부모 쪽에 기본 생성자 이외 생성자가 있어야 함)
		System.out.println("student()");
	}
	
	public Student(String schoolName) {
		this.schoolName = schoolName;
		System.out.println("student(1)");
	}
	
	public Student(String name, int age, String schoolName) {
		super(name, age); //부모 생성자 부르는 법
		this.schoolName = schoolName;
		System.out.println("student(3)");
	}

	//메소드-gs
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName; //this 본인 지칭
	}

	//메소드-일반
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + ", getName()=" + this.getName() + ", getAge()=" + super.getAge() + "]";
	}
	
	/*
	public void showInfo() {
		System.out.println("이름: "+super.name+", 나이: "+super.age+", 학교: "+schoolName);
	}
	*/
	
	public void showInfo() {
		//부모 toString() 그대로 사용하고 싶을 때
		System.out.println(super.toString());
		System.out.println("학교: "+schoolName);
	}

}
