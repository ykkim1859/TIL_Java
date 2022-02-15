/**
   Date : 2022.02.15
   Author : ykkim1859
   Description : KIOSK
   version : 1.0
 */

package java0215;

import java.util.Scanner;

public class ex06_KIOSK {

	public static void main(String[] args) {
		// 키오스크 : 터치스크린 방식 무인주문시스템
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		int price = 0;
		String menu = "";
		
		System.out.println();
		System.out.println("pdinggg 카페에 오신 것을 환영해욧");
		System.out.println("주문 도와드릴게욧\n");
		
		System.out.println("1.아메리카노\t\t2.고구마라떼");
		System.out.println("3.민트초코프라푸치노\t\t4.아샷추");
		System.out.println();
		System.out.println("메뉴를 선택하세욧 >>");
		
		num = sc.nextInt();
		
		switch(num) {
			case 1 : 
				menu = "아메리카노";
				price = 2000;
				break;
			case 2 : 
				menu = "고구마라떼";
				price = 3000;
				break;
			case 3 : 
				menu = "민트초코프라푸치노";
				price = 4000;
				break;
			case 4 : 
				menu = "아샷추";
				price = 3000;
				break;
			default : 
				System.out.println("그 메뉴는 없는데욧");
				break;
		}
		
		if(num>=1 && num<=4) {
			System.out.print("\n주문하신 메뉴는 " + menu);
			System.out.println(", 가격은 " + price + "원 이에욧");
		}
		
		System.out.println("또 오세욧 꺄르륵");
	}
	

}
