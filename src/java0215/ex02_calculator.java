/**
   Date : 2022.02.15
   Author : ykkim1859
   Description : Scanner예제
   version : 1.0
 */

package java0215;

import java.util.Scanner;

public class ex02_calculator {

	public static void main(String[] args) {
		// num1, num2, result 변수 선언해서
		// 두 개의 숫자를 입력받고
		// 두 수의 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 출력
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, result;
		
		System.out.println("num1 >> ");
		num1 = sc.nextInt();
		
		System.out.println("num2 >> ");
		num2 = sc.nextInt();
		
		result = num1 + num2;
		System.out.println("덧셈결과 : " + result);
		
		result = num1 - num2;
		System.out.println("뺄셈결과 : " + result);
		
		result = num1 * num2;
		System.out.println("곱셈결과 : " + result);
		
		result = num1 / num2;
		System.out.println("나눗셈결과 : " + result);
		
		result = num1 % num2;
		System.out.println("나머지결과 : " + result);
		
		

	}

}
