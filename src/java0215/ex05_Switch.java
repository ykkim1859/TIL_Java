/**
   Date : 2022.02.15
   Author : ykkim1859
   Description : Switch
   version : 1.0
 */

package java0215;

import java.util.Scanner;

public class ex05_Switch {

	public static void main(String[] args) {
		/*
		 <Switch문-Case문 기본문법>
		 switch(조건변수){
		 
		 case 변수값1 : 
		 	해당 조건이 맞을 경우 실행;
		 	break;
	 	 case 변수값2 : 
	 	 	해당 조건이 맞을 경우 실행;
		 	break;
	 	 case 변수값n : 
	 	 	해당 조건이 맞을 경우 실행;
		 	break;
	 	 default : 
	 	 	case에서 해당하는 조건이 없을 경우 실행 (else);
	 	 	break;
		 
		 } 
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자입력 >> ");
		int sNum = sc.nextInt();
		
		switch(sNum) {
		case 1 : case 3 : case 5 : case 7 : case 9 : 
			System.out.print("홀수");
			break;
			
		case 2 : case 4 : case 6 : case 8 : case 10 : 
			System.out.print("짝수");
			break;
			
		default : 
			System.out.print("그 외의 숫자를 입력했습니다");
			break;
		}
		
		
		// 월별 날짜 계산기
		
		System.out.println("월(숫자만) 입력 >> ");
		int Mon = sc.nextInt();
		int day = 0;
		
		switch(Mon) {
		
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : 
			day = 31;
			break;
			
		case 4 : case 6 : case 9 : case 11 : 
			day = 30;
			break;
			
		case 2 : 
			day = 28;
			break;
			
		default : 
			System.out.print("다시 입력하세요");
			break;
		}
		
		if(Mon>0 && Mon<=12) {
			System.out.print(Mon + "월은 " + day + "일까지 있습니다.");
		}
		
	}

}
