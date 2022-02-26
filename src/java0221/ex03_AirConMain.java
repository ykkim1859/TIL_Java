package java0221;

import java.util.Scanner;

import java0215.ex09_forEx;
// import java0221.ex02_AirCon;
// import 패키지명.클래스명;

public class ex03_AirConMain {

	public static void main(String[] args) {
		
		// 객체 생성
		
		// ex) Scanner객체
		Scanner sc = new Scanner(System.in);
		
		// AirCon객체 생성 : 하나의 제품
		ex02_AirCon airCon = new ex02_AirCon();
		
		// 다른 패키지의 클래스도 사용가능!
		ex09_forEx forEx = new ex09_forEx();
		
		// 객체에 대한 필드값 초기화
		// 객체 맴버(필드)에 접근하는 방법 : .(도트)연산자 사용

		airCon.color = "white";
		airCon.temp = 20;
		airCon.price = 160;
		
		System.out.println("airCon객체 색상 : " + airCon.color);
		System.out.println("airCon객체 온도 : " + airCon.temp);
		System.out.println("airCon객체 가격 : " + airCon.price);
		
		// 객체의 메소드 호출
		// 객체의 맴버(메소드)에 접근하는 방법 : .(도트)연산자 사용
		System.out.println();
		System.out.println("======== 메소드 ========");
		airCon.onPower();
		airCon.checkTemp();
		airCon.upTemp(3);		
		// int temp21 = airCon.upTemp();	// 온도를 1 올리기도 하지만 값자체(숫자)가 될 수도 있다.
		airCon.checkTemp();
		airCon.downTemp();
		airCon.checkTemp();
		airCon.offPower();
		
	}

}






