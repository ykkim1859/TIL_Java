package java0217;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// 1. 배열, while문, switch-case문 이용해서
		// 2. 학생 수 입력받고
		// 3. 학생수만큼 점수 입력받고
		// 4. 학생별 점수 출력하고
		// 5. 점수의 총합, 평균, 최고점수 출력

		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int stuNum = 0;
		int score[] = null;
		double sum = 0;
		double avg = 0;
		int max = 0;
		
		while(run) {
			System.out.println("===================================================");
			System.out.println("1. 학생수  2. 점수입력  3. 학생별점수  4. 분석   5. 종료");
			System.out.println("===================================================");
			System.out.println("메뉴 선택 >> ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1 : 
				// 학생 수 입력
				System.out.println("학생수 입력 >> ");
				stuNum = sc.nextInt();
				break;
				
			case 2 : 
				// 점수 입력
				score = new int[stuNum];
				for(int i=0; i<score.length; i++) {
					System.out.println((i+1) + "번째 학생 점수 입력 >> ");
					score[i] = sc.nextInt();
				}
				break;
				
			case 3 : 
				// 학생별 점수
				for(int i=0; i<score.length; i++) {
					System.out.println((i+1) + "번째 학생 점수 : " + score[i]);
				}
				break;
				
			case 4 : 
				// 총합, 평균, 최고점수
				for(int i=0; i<score.length; i++) {
					sum += score[i];
					avg = sum / score.length;
					
					if(i==0) {
						max = score[i];
					}
					
					if(max<score[i]) {
						max = score[i];
					}
				}
				System.out.println("총점 : " + sum);
				System.out.println("평균 : " + avg);
				System.out.println("최고점수 : " + max);
				break;
				
			case 5 : 
				// 종료
				run = false;
				System.out.println("종료");
				break;
				
			default : 
				System.out.println("잘못 입력");
				break;
			
			
			
			
			}
		}
		
		
	}

}
