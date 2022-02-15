/**
   Date : 2022.02.15
   Author : ykkim1859
   Description : for문 예제
   version : 1.0
 */

package java0215;

import java.util.Scanner;

public class ex09_forEx {

	public static void main(String[] args) {
		// 두 개의 정수 (시작, 끝)을 입력받아서
		// 두 수 사이의 숫자의 총합 구하기
		// sNum, lNum, sum 변수 사용
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("시작숫자 입력 >> ");
		int sNum = sc.nextInt();
		System.out.println("끝숫자 입력 >> ");
		int lNum = sc.nextInt();
		
		int sum = 0;
		int max;
		int min;
		int i;
		
		if(sNum>lNum){
	        max = sNum;
	        min = lNum;
	    } else{
	        max = lNum;
	        min = sNum;
	    }

		
		 for(i=min; i<=max; i++){
		        sum = sum + i;
		            if(i<max){
		            	System.out.println(i + "+");
		            } else{
		            	System.out.println(i + "=" + sum);
		            }
		    }
		
		
		

	}

}
