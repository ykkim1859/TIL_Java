/**
   Date : 2022.02.15
   Author : ykkim1859
   Description : 조건문예제
   version : 1.0
 */

package java0215;

import java.util.Scanner;

public class ex04_conditionEx {

	public static void main(String[] args) {
		/*
		 <중첩if문>
		 if(조건식){
		  if(조건식){
		 	조건식이 참일 경우 실행;
	 	  } else{
	 	 	조건식이 거짓일 경우 실행;
	 	  }
	 	 }
		 
		*/
		
		// 95점 이상 : A+ / 90점 이상 : A ... / 60점 미만 : F
		// 점수 입력받아서 학점 계산하는 프로그램
		// score, grade 변수 사용
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수 >> ");
		int score = sc.nextInt();
		
		String grade;
		// char도 쓸 수 있으나 
		// +가 붙으면서 2글자 이상이 되기에 문장 처리
			
		if(score <= 100) {
			if(score>=90) {
				if(score>=95) {
					grade = "A+";
				} else {
					grade = "A";
				}
			} else if(score>=80) {
				if(score>=85) {
					grade = "B+";
				} else {
					grade = "B";
				}
				
			} else if(score>=70) {
				if(score>=75) {
					grade = "C+";
				} else {
					grade = "C";
				}
			} else if(score>=60) {
				if(score>=65) {
					grade = "D+";
				} else {
					grade = "D";
				}
			} else {
				grade = "F";
			}
			
			System.out.println("당신의 학점은 " + grade + " 입니다.");
			
		} else {
			System.out.println("입력범위를 초과했습니다.");
		} 
		
		
		
	}
	// 단계별로 만들어
	// <= 100 / 입력범위 초과
	// <= 90, 80, 70, 60
	// 95, 85, 75, 65 / A, B, C, D
	
	// 다시 만들어보기!!!

}
