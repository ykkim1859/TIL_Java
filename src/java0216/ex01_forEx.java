/**
   Date : 2022.02.16
   Author : ykkim1859
   Description : 중첩for문
   version : 1.0
 */

package java0216;

public class ex01_forEx {

	public static void main(String[] args) {
		/*
		
		  <중첩for문 : for문 안에 for문>
		  
		  for(초기식; 조건식; 증감식){
		  
		  	for(초기식; 조건식; 증감식){
		  	
		 	실행문;
	 	 	}
 	 	  }
	 	 	
	 	  <continue문 : 반복문과 함께 사용, continue문 만나면 이후 내용을 실행하지 않고 증감식으로 이동>
	 	  
	 	  <break문 : 반복문과 함께 사용, break문이 실행되면 반복문 종료>
		 
		*/
		
		// 구구단
		
		for(int i=2; i<=9; i++) {
			
			if(i>4) {
				break;
			}
			
			System.out.println("==== " + i + "단 ====");
			
			for(int j=1; j<=9; j++) {
				
				System.out.println(i + "x" + j + "=" + (i*j));
				
			}
			
			System.out.println();
			
		}
		
		

	}

}
