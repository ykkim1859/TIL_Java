/**
   Date : 2022.02.16
   Author : ykkim1859
   Description : while문을 이용한 예제
   version : 1.0
 */

package java0216;

import java.util.Scanner;

public class ex04_whileEx {
	
	public static void main(String[] args) {

		// 계좌, ATM 만들기
		int balance = 0;
		boolean run = true;
		int menu;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("========================================\n");
			System.out.println("1. 예금\t 2. 출금\t 3. 잔액조회\t 4. 종료\t");
			System.out.println("========================================");
			System.out.println("메뉴선택 >>");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1 :  
				System.out.print("예금액 >> ");
				balance += sc.nextInt();
				// 예금액을 현재잔액에 플러스
				break;
			case 2 : 
				System.out.print("출금액 >> ");
				int amount = sc.nextInt();
				// 출금액을 현재잔액에서 마이너스
				// Q. 현재 잔액이 출금액보다 적을 경우 잔액이 부족합니다 메세지 뜨게 하기
				if(balance>=amount) {
					balance -=amount;
				} else {
					System.out.print("잔액 " + (amount-balance) + " 부족\n");
				}
				break;
			case 3 : 
				System.out.println("잔액조회 : " + balance);
				break;
			case 4 : 
				run = false;
				break;
			default : 
				System.out.println("다시 입력해주세요!\n");
				break;
			}
		}
		
	}
}
