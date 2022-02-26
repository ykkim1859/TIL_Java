/**
   Date : 2022.02.17
   Author : ykkim1859
   Description : 배열 활용 예제2
   version : 1.0
 */


package java0217;

import java.util.Scanner;

public class ex02_ArrayEx2 {

	public static void main(String[] args) {
		// 크기가 5인 배열 선언
		// 스캐너를 이용해서 5개 값 입력
		// 입력한 값 중 가장 큰 값, 작은 값 구하기
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		// int arr[] = {0,0,0,0,0};
		
		int max = 0;
		int min = 0;
		
		System.out.println("점수 " + arr.length + "개를 입력해주세요");
			
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.print((i+1) + "번째 숫자 입력 >> ");
			arr[i] = sc.nextInt();
		
			if(i==0) {
				max = arr[0];
				min = arr[0];
			}
			// min, max 변수에 아무것도 없기에 첫 번째 값을 무조건 받기 위한 식

			
			if(arr[i] > max) {
				max = arr[i];
			} else if(arr[i] < min) {
				min = arr[i];
			}
			
		}
		
		System.out.println("입력한 값 중 가장 큰 수는 " + max + " 입니다");
		System.out.println("입력한 값 중 가장 작은 수는 " + min + " 입니다");
		

	

		
		
	}

}
