package java0215;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// 95점 이상 : A+ / 90점 이상 : A ... / 60점 미만 : F
		// 점수 입력받아서 학점 계산하는 프로그램
		// score, grade 변수 사용
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수 >> ");
		int score = sc.nextInt();
		
		String grade;
		
		if(score<=100) {
			if(score<=100 && score>=95) {
				grade = "A+";
			} else if(score<=94 && score>=90) {
				grade = "A";
			} else if(score<=89 && score>=85) {
				grade = "B+";
			} else if(score<=84 && score>=80) {
				grade = "B";
			} else if(score<=79 && score>=75) {
				grade = "C+";
			} else if(score<=74 && score>=70) {
				grade = "C";
			} else if(score<=69 && score>=65) {
				grade = "D+";
			} else if(score<=64 && score>=60) {
				grade = "D";
			} else{
				grade = "F";
			} 
			
			System.out.println("당신의 학점은 " + grade + "입니다!");
			
		} else{
			
			System.out.println("잘못 입력하셨습니다.");
	} 
		
		
		
	}

}
