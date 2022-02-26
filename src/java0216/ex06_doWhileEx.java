/**
   Date : 2022.02.16
   Author : ykkim1859
   Description : do-while 예제
   version : 1.0
 */


package java0216;

import java.util.Scanner;

public class ex06_doWhileEx {

	public static void main(String[] args) {
		// Up & Down Game
		
		// 1. 3번 안에 정답을 맞추면 통과
		// 2. 그 이후에 맞춘 사람이 벌칙
		
		int answer = (int)(Math.random() * 45) + 1;
		// 정답숫자, 1~45 랜덤한 수
		int input = 0;
		// 우리가 말하는 숫자
		int count = 0;
		// 정답 말한 횟수
		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		
		System.out.println("Up & Down Game 시작");
		
		do {
			System.out.println("1~45 중 숫자 입력");
			input = sc.nextInt();
			
			count++;
			
			if(answer > input) {
				System.out.println("Up! 더 큰 수 입력");
			} else if(answer < input) {
				System.out.println("Down! 더 작은 수 입력");
			} else {
				System.out.println("정답은 " + answer);
				System.out.println("시도한 횟수는 " + count + "번");
				run = false;
			}
		} while(run);
		
		if(count <= 3) {
			System.out.println("통과");
		} else {
			System.out.println("벌칙 당첨");
		}
		
	}

}
