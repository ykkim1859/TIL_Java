/**
   Date : 2022.02.14
   Author : ykkim1859
   Description : 문장형 String
   version : 1.0
 */

package java0214;

public class ex05_String {

	public static void main(String[] args) {
		// 기본데이터 타입 x / 참초형 데이터타입
		// 문자형 집합
		
		String str1 = "자바공부는 ";
		String str2 = "재미있어";
		String str3 = "너무 어려워";
		
		String result;
		result = str1 + str3;
		System.out.println(result);		// 자바공부는 재미있어
		
		System.out.println(str1 + "너무 " + str3);
		
		String str4 = "Java";
		int num1 = 11;
		
		result = str4 + num1;
		System.out.println(result);
	}

}
