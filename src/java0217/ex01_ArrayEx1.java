/**
   Date : 2022.02.17
   Author : ykkim1859
   Description : 배열 활용 예제1
   version : 1.0
 */


package java0217;

import java.util.Scanner;

public class ex01_ArrayEx1 {

	public static void main(String[] args) {

		int num[] = {8, 2, 6, 1, 9, 3, 4, 10, 7, 5};
		
		int i = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1부터 10까지의 숫자를 입력 >> ");
		int value = sc.nextInt();
		
		for(; i<num.length; i++) {
			// 우리가 입력한 값 value
			// num[0]~num[9] 까지 비교
			if(value==num[i]) {
				System.out.println("입력한 값 " + value + "는 index " + i + "번에 있다");
			}
		}
		
	
	}

}
