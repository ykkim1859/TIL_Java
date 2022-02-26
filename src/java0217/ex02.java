package java0217;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// 크기가 5인 배열 선언
		// 스캐너를 이용해서 5개 값 입력
		// 입력한 값 중 가장 큰 값, 작은 값 구하기
		
		int arr[] =  new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		int min = 0;
		
		for(int i=0; i<arr.length; i++) {
			System.out.println((i+1) + "번째 숫자 입력 >> ");
			arr[i] = sc.nextInt();
			
			if(i==0) {
				max = arr[0];
				min = arr[0];
			}
			
			if(arr[i]>max) {
				max = arr[i];
			} else if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);
	}

}
