/**
   Date : 2022.02.16
   Author : ykkim1859
   Description : 배열 (Array) 예제1
   version : 1.0
 */

package java0216;

import java.util.Scanner;

public class ex08_arrayEX {

	public static void main(String[] args) {
		// 점수 3개를 입력받아
		// 입력받은 값의 총점, 평균 구하기
		// hint) int score[] = new int[3];
		//		int score[] = {0,0,0};
		
		Scanner sc = new Scanner(System.in);
		int score[] = {0,0,0};
		int sum = 0;
		
		for(int i=0; i<score.length; i++) {
			
			System.out.println((i+1) + "번째 점수 입력 >> ");
			
			score[i] = sc.nextInt();
			// score[0] = sc.nextInt();
			// score[1] = sc.nextInt();
			// score[2] = sc.nextInt();
			
			sum += score[i];
			// sum = sum + score[i];
			// sum = 0 + score[0];
			// sum = 0 + score[0] + score[1];
			// sum = 0 + score[0] + score[1] + score[2];
		}
		
		double avg = (double)sum / score.length;
		
		System.out.println("입력 점수 총점 : " + sum);
		System.out.println("입력 점수 평균 : " + avg);
		
	}

}
