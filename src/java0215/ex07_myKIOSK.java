/**
   Date : 2022.02.15
   Author : ykkim1859
   Description : MY KIOSK
   version : 1.0
 */

package java0215;

import java.util.Scanner;

public class ex07_myKIOSK {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num;
		String flavor = "";
		String detail = "";
		
		System.out.println();
		System.out.println("안녕하세요 베스킨라빈스4 입니다!");
		System.out.println("사이즈는 컵으로 동일하며, 가격은 컵당 3500원입니다!\n");
	
		System.out.println("1.민트초코칩\t\t2.뉴욕치즈케이크");
		System.out.println("3.엄마는외계인\t\t4.베리베리스트로베리4");
		System.out.println();
		System.out.println("맛을 선택하세요! >>");
		
		num = sc.nextInt();
		
		switch(num) {
			case 1 : 
				flavor = "민트초코칩";
				detail = "민트맛 아이스크림 + 초코칩";
				break;
			case 2 : 
				flavor = "뉴욕치즈케이크";
				detail = "치즈맛 아이스크림 + 치즈케이크";
				break;
			case 3 : 
				flavor = "엄마는외계인";
				detail = "초코맛 아이스크림 + 초코볼";
				break;
			case 4 : 
				flavor = "베리베리스트로베리";
				detail = "딸기맛 아이스크림 + 딸기";
				break;
			default : 
				System.out.println("해당하는 메뉴는 없습니다!");
				break;
		}
		
		if(num>=1 && num<=4) {
			System.out.print("\n주문하신 맛은 " + flavor);
			System.out.println("이며, 해당 아이스크림은 " + detail + " 조합입니다!");
		}
		
		System.out.println("다음에 또 오세요~!");
	}
	
		
	}

