/**
   Date : 2022.02.16
   Author : ykkim1859
   Description : 반복문 while문
   version : 1.0
 */

package java0216;

public class ex03_loopWhile {

	public static void main(String[] args) {
		   
		/*
			<반복문 while문 기본구조>
			
			초기화식
			while(반복조건) {
			
				실행문; 
				(증감식);
			
			}
		*/
		
		// while문 : 반복횟수를 정하지 않고 사용할 때
		
		System.out.println("for문 이용한 반복문");
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		
		System.out.println("\nwhile문 이용한 반복문");
		
		int j=1;
		while(j<=10) {
			System.out.println(j);
			j++;
		}
		
		
		boolean run = true;
		
		while(run) {
			int dice = (int)(Math.random()*6) + 1;
			if(dice==5) {
				run = false;
			}
			System.out.println("주사위 값 : " + dice);
		}
		
	}

}
