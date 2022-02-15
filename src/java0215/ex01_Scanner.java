/**
   Date : 2022.02.15
   Author : ykkim1859
   Description : 입력 (Scanner)
   version : 1.0
 */

package java0215;

import java.util.Scanner;
import java0214.ex05_String;

public class ex01_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Scanner 객체 만들기 / 빨간 줄 그어질 것 - import java.util.Scanner; 필요
		
		System.out.print("print");
		System.out.println("println");
		System.out.println("print와 println의 차이점!");
		
		// ln : 줄바꿈
		
		System.out.println("이름 입력 >> ");
		String name = sc.next();	// 문자 입력받을 때
		
		System.out.println("나이 입력 >> ");
		int age = sc.nextInt();		// 숫자 입력받을 때
		
		sc.nextLine().trim();       // 앞 뒤 공백 제거
		System.out.println("주소 입력 >> ");
		String addr = sc.nextLine();	// 한 문장을 입력받을 때
		
		System.out.println();
		System.out.println("=====출력=====");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + addr);
	}

}
