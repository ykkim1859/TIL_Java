/**
   Date : 2022.02.15
   Author : ykkim1859
   Description : 반복문 for문
   version : 1.0
 */

package java0215;

import java.util.Scanner;

public class ex08_loopFor {

	public static void main(String[] args) {
		/*
		 <for문의 기본구조>
		 for(초기식; 조건식; 증감식){
		 	실행문;
	 	 }
		*/
		
		int i;
		for(i=1 ; i<=10 ; i++) {
			
			System.out.println(i + ". 실행문");
		
		}
		
		// 반복문 종료 후 i값 : 11
		System.out.println("반복문 종료 후 i : " + i);
		
		// 조건식		실행문	증감식
		// 1<=10	 실행	 1+1
		// 2<=10	 실행	 2+1
		// 3<=10	 실행	 3+1
		// 4<=10	 실행	 4+1
		// 5<=10	 실행	 5+1
		// 6<=10	 실행	 6+1
		// 7<=10	 실행	 7+1
		// 8<=10	 실행	 8+1
		// 9<=10	 실행	 9+1
		// 10<=10	 실행	10+1
		// 10<=10	 실행	10+1
		// 11<=10    종료

		
		// 숫자를 입력받아서 그 숫자만큼 반복하는 반복문 만들기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("반복숫자 입력 >> ");
		int num = sc.nextInt();
		
		for(int j=1; j<=num; j++) {
			System.out.println(j + ". 실행문");
		}
		
	
	
	}

}
