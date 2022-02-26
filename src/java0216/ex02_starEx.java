/**
   Date : 2022.02.16
   Author : ykkim1859
   Description : for문을 이용한 별 찍기 예제
   version : 1.0
 */

package java0216;

public class ex02_starEx {

	public static void main(String[] args) {
		// 백준 예제
		
		//     *
		//    **
		//   ***
		//  ****
		
		for(int i=1; i<=4; i++) {
            for(int j=1; j<=4-i; j++) {
            	System.out.print(" ");
            }
            for(int k=1; k<=i; k++) {
            	System.out.print("*");
            }
            System.out.println();
        }	
		
		// ****
		// ***
		// **
		// *
		System.out.print("\n=========\n\n");
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print("*");
			}
			for(int k=1; k<=i-1; k++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		

		
	}

}
