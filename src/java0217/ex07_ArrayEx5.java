/**
   Date : 2022.02.17
   Author : ykkim1859
   Description : 2차원 배열 예제2
   version : 1.0
 */

package java0217;

import java.util.Scanner;

public class ex07_ArrayEx5 {

	public static void main(String[] args) {
		// 스캐너를 이용해서 고등학교 3학년 동안의 학기별 성적 입력
		// 총점과 평균 구하기
		
		Scanner sc = new Scanner(System.in);
		
		double score[][] = new double[3][2];
		double sum = 0;
		double avg = 0;
		
		System.out.println("성적 입력");
		
		for(int i=0; i<score.length; i++) {
			// 학년
			
			for(int j=0; j<score[i].length; j++) {
				// 학기
				
				System.out.println((i+1) + "학년 " + (j+1) + "학기 성적 입력 >> ");
				score[i][j] = sc.nextDouble();
				sum += score[i][j];
				
			}
			
			avg = sum / (score.length * score[0].length);
			// score[0] -> i는 for문 안에서만 쓸 수 있기에 대신 0 넣음
			
			
			
		}
		
		System.out.println("고등학교 성적 총점 : " + sum);
		System.out.println("고등학교 성적 평균 : " + avg);
		
	}

}
