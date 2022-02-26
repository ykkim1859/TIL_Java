package java0223;

import java.util.Scanner;

public class ex02_FactMain {

	public static void main(String[] args) {
		// 숫자 입력 받아서
		// getFactorial() 함수 호출
		
		Scanner sc = new Scanner(System.in);
		
		ex01_Factorial factorial = new ex01_Factorial();
		// 한 개 import 방법 : ctrl + shift + m
		// 모두 import 방법 : ctrl + shift + o
		
		System.out.println("숫자 입력 >> ");
		int num = sc.nextInt();
		
		int result = factorial.getFactorial(num);
		System.out.println(num + "!의 결과 : " + result);
		
		int result1 = factorial.getPower(num);
		System.out.println("power의 결과 : " + result1);
		
	}

}
