/**
   Date : 2022.02.25
   Author : ykkim1859
   Description : final 정의
   version : 1.0
 */

package java0225;

public class Final {

	/*
	
		 final : 수정 불가
		 
		 final 변수 : 상수(변하지 않는 수) 의미 ex) PI = 3.14
		 final 메소드 : 자식클래스에서 재정의 불가
		 final 클래스 : 상속 불가
		 
		 ex) JavaScript에서 변수 선언할 때 let, const 사용
		 	 그 중 const가 Java에서 final에 해당
		 
	*/
	
	int num = 10;
	final int NUM = 100;	// final은 대문자 사용
	
	// 메소드
	public static void main(String[] args) {
		
		Final cons = new Final();
		cons.num = 50;
		// cons.NUM = 200;
		// NUM은 final로 지정했기에 값 바꾸지 못함
		
		System.out.println("num : " + cons.num);
		System.out.println("NUM : " + cons.NUM);
		
	}
			
			
}
