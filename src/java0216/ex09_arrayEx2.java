/**
   Date : 2022.02.16
   Author : ykkim1859
   Description : 배열 (Array) 예제2
   version : 1.0
 */

package java0216;

import java.util.Scanner;

public class ex09_arrayEx2 {

	public static void main(String[] args) {
		// 동전 갯수 구하기
		// 어떤 금액을 입력하면 각 동전이 몇 개씩 필요한지 출력
		// 2680원 입력 -> 500원 5개 / 100원 1개 / 50원 1개 / 10원 3개
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액 입력 >> ");
		int won = sc.nextInt();

		int coin[] = {500,100,50,10};
		// coin[0] = 500 ...
		
		for(int i=0; i<coin.length; i++) {
			
			int coinCnt = won / coin[i];
			// 코인갯수 = 2680 / 500 => 5개
			// 코인갯수 = 180 / 100 => 1개
			// 코인갯수 = 80 / 50 => 1개
			// 코인갯수 = 30 / 10  => 3개
			
			won = won % coin[i];
			
			System.out.println(coin[i] + "원 동전은 " + coinCnt + "개");
			System.out.println("남은 금액은 " + won + "원");

			
		}
		
		

	}

}
