package java0215;

import java.util.Scanner;

public class 백준 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 정수 입력 >> ");
		int A = sc.nextInt();
		
		System.out.println("두번째 정수 입력 >> ");
		int B = sc.nextInt();
		
		if(A>B) {
			System.out.println(">");
		} else if(A<B) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
		
		
		
		System.out.println("숫자 입력 >> ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			System.out.println(i);
		}
		

	}

}
