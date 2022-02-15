/**
   Date : 2022.02.14
   Author : ykkim1859
   Description : 변수(variable)
   version : 1.0
 */
package java0214;

public class ex02_variable {

	public static void main(String[] args) {
		// variable(변수) : 프로그램 실행에 필요한 데이터를 저장하기
		// 위해 메모리 공간을 할당하고 이름을 부여한 것
		
		// var num1 = 10;
		// let num2 = 10;
		// const NUM3 = 10;
		// [변수타입] [변수명] = [변수값];
		
		int age = 30;	// age 선언 + 초기화
		
		int age1;		// age1 변수 선언
		age1 = 20;		// age1 변수초기화(할당)
		
		int age2, age3, age4;
		int age5=21, age6=22, age7=23;
		
		// [1] JavaScript에서는 변수타입을 var, let, const : 데이터타입 x
		// 	   JavaScript데이터 타입 : String, number, boolean
		
		// [2] Java에서는 변수를 선언하기 전에 데이터타입을 정해줘야 한다!
		
		// 기본데이터 타입 
		// 			  1byte		2byte		4byte		8byte
		// (1) 정수형   byte		short		 int		 long(L)
		// (2) 실수형	   						float(F)	 double
		// (3) 문자형   			 char
		// (4) 논리형  boolean
		
		// 1byte => 8bit : -128 ~ 127
		// 1bit => 0과 1로 나타날 수 있는 단위
		// 0	0	 0	 0	 0	 0	 0	 0 
		// 128	64	 32	 16	 8	 4	 2	 1
		
		byte a = 10;
		int b = 128;
		
		System.out.println(a);
		System.out.println(a+b);
		
		System.out.println("a : " + a);
		System.out.println("a+b : " + a + b);
		// 문자열과 숫자열을 합치면 숫자열이 문자열로 인식돼서 출력된다.
		System.out.println("a+b : " + (a + b));
		
		// 변수이름 표기법
		// [1] 카멜(낙타)표기법 : 시작은 소문자, 다른 뜻의 단어가 나올때 첫글자 대문자로
		// ex) 학생수를 표시 => numberOfStudent
		// [2] 영문자, 숫자, 특수문자( _(언더바), $(달러표시) ) 사용가능
		// [3] 숫자로 시작할 수 없다.
		// [4] 예약어(int, double 등등) 사용할 수 없다.
		
		// 숫자로 시작해서 오류
		// int 123;
		// int 1number;
		
		int number1;
		int number_1;
		int number$;
		
		int _number1;
		int $number;
		
		// 특수문자 중에 _(언더바), $(달러) 표시 외에 사용불가
		// int number#;
		// int number!;
		
		// 변수명으로 예약어를 사용할 수 없다.
		// int int;
		// int double;
		// int package;
		// int void;
		// int static;
	}

}