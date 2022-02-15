/**
   Date : 2022.02.14
   Author : ykkim1859
   Description : 문자형 character
   version : 1.0
 */
package java0214;

public class ex04_char {

	public static void main(String[] args) {
		// 문자형 변수타입 char(2byte)
		
		char ch1;
		ch1 = 'A';
		// 문자형 데이터 변수에 값을 할당할 경우 ""가 아닌 ''를 사용한다.
		
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 = 'a';
		
		System.out.println(ch2);
		System.out.println((int)ch2);
		
		int num1 = 65;
		int num2 = 97;
		
		System.out.println(num1);
		System.out.println((char)num1);
		
		System.out.println(num2);
		System.out.println((char)num2);
		
		// Q. 본인이름을 숫자로 표시해보세요!
		// 숫자로 본인의 이름을 표시해보세요!
		
		char ch3 = '황';		// 54889
		char ch4 = '인';		// 51064
		char ch5 = '철';		// 52384
		
		System.out.println((int)ch3);
		System.out.println((int)ch4);
		System.out.println((int)ch5);
		
		int num3 = 54889;
		int num4 = 51064;
		int num5 = 52384;
		
		System.out.println((char)num3);
		System.out.println((char)num4);
		System.out.println((char)num5);
		

	}

}
