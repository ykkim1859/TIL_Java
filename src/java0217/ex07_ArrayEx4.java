/**
   Date : 2022.02.17
   Author : ykkim1859
   Description : 2차원 배열 예제2
   version : 1.0
 */

package java0217;

public class ex07_ArrayEx4 {

	public static void main(String[] args) {
		// 2차원 배열과
		// 중첩for문 사용해서
		// 구구단 출력
		
		// 2 ~ 9단 : 8개(i)
		// x1 ~ x9 : 9개(j)
		
		int multi[][] = new int[8][9];
		
		for(int i=2; i<multi.length+2; i++) {
			
			for(int j=1; j<multi[0].length+1; j++) {
				multi[i-2][j-1] = i*j;
				
				System.out.println(i + " x " + j + " = " + multi[i-2][j-1]);
			}
			
			System.out.println();
			
		}

	}

}
