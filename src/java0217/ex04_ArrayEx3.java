/**
   Date : 2022.02.17
   Author : ykkim1859
   Description : 배열 예제
   version : 1.0
 */

package java0217;

import java.util.Scanner;

public class ex04_ArrayEx3 {

	public static void main(String[] args) {
		// 1. 배열, while문, switch-case문 이용해서
		// 2. 학생 수 입력받고
		// 3. 학생수만큼 점수 입력받고
		// 4. 학생별 점수 출력하고
		// 5. 점수의 총합, 평균, 최고점수 출력
		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int score[]=null;
		int stuNum = 0; 
		boolean check1 = false;
		boolean check2 = false;
		
		while(run) {
			System.out.println("===================================================");
			System.out.println("1. 학생수  2. 점수입력  3. 학생별점수  4. 분석   5. 종료");
			System.out.println("===================================================");
			System.out.println("메뉴 선택 >> ");
			int menu = sc.nextInt();
		
			
		switch(menu){
		case 1 :
			System.out.print("학생수 입력 >> ");
			stuNum = sc.nextInt();
			check1 = true;
			break;
			
		case 2 :
			score = new int[stuNum];
			if(score.length<=0) {
				System.out.println("학생수 다시 입력");
			} else {
				System.out.println(" " + score.length + "명 점수 입력");
			}
			
			for(int i=0; i<score.length; i++) {
				System.out.println((i+1) + "번째 학생점수 입력 >> ");
				score[i] = sc.nextInt();
			}
			
			check2 = true;
			
			break;
			
		case 3 :
			if(!check1) {
				System.out.println("학생수 다시 입력");
			} else if(!check2) {
				System.out.println("점수 다시 입력");
			} else {
				for(int i=0; i<score.length; i++) {
					System.out.println((i+1) + "번 학생점수 : " + score[i]);
				}
			}
			
			break;
			
		case 4 :
			// 총점, 평균, 최고점수
			// 최고점수 받은 학생
			
			double sum = 0;
			double avg = 0;
			int max = 0;
			int idx = 0; //최고점수
			
			if(!check1) {
				System.out.println("학생수 다시 입력");
			} else if(!check2) {
				System.out.println("점수 다시 입력");
			} else {
				
				for(int i=0; i<score.length; i++) {
					sum += score[i];
					
					if(i==0) {
						max = score[0];
					}
					if(score[i]>max) {
						max = score[i];
					}
					
					if(score[i]==max) {
						idx = i+1;
						
					}
				}
				avg = sum / score.length;
				
				System.out.println("===== 성적표 =====");
				System.out.println("총점 : " + sum);
				System.out.println("평균 : " + avg);
				System.out.println("최고점수 : " + max);
				System.out.println("최고 점수를 받은 학생은 " + idx + "번 학생");
				
				
			}
			
			break;
			
		case 5 : 
			run = false;
			System.out.print("프로그램 종료");
			break;
			
		default : 
			System.out.print("다시 입력\n");
			break;
			
		}
		}
		
		

	}

}
