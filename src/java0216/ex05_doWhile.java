/**
   Date : 2022.02.16
   Author : ykkim1859
   Description : do-while문
   version : 1.0
 */

package java0216;

public class ex05_doWhile {

	public static void main(String[] args) {
		// while문과 do-while문의 차이점
		// while문은 반복문을 실행하기 전에 조건식 검사
		// do-while문은 반복문을 실행한 후 조건식 검사
		// do-while문은 적어도 반복문 한 번은 실행
		
		/*
			<do-while문의 기본구조>
		
			do{
		
				반복할 실행문;
			
			} while(조건식);
		
		*/
		
		
		int i = 11;
		int j = 11;
		
		// while문
		while(j<=10) {
			System.out.println("while문에서 j값 : " + j);
			j++;
		}
		
		// do-while문
		do {
			System.out.println("do-while에서 i값 : " + i);
			i++;
		} while(i<=10);
		

	}

}
