package java0217;

import java.util.Scanner;

public class 백준 {

	public static void main(String[] args) {
		
		
		// 최댓값 구하기
		
		int arr[] = new int[9];
		int max = 0;
		int i=0;
		int idx = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(; i<arr.length; i++) {
			System.out.println((i+1) + "번째 숫자 입력 >> ");
			arr[i] = sc.nextInt();
			
			if(i==0) {
				max = arr[i];
			}
			
			if(arr[i]>max) {
				max = arr[i];
			}
			
			if(arr[i]==max) {
				idx = (i+1);
			}
			
			
		}
		
		System.out.println("최댓값은 " + max + "이고, 이 값은" + idx + "번째 숫자");
		

	}

}
