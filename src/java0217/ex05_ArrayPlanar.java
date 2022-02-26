/**
   Date : 2022.02.17
   Author : ykkim1859
   Description : 2차원 배열
   version : 1.0
 */

package java0217;

public class ex05_ArrayPlanar {

	public static void main(String[] args) {
		// 2차원 배열 : 행렬
		// 타입[][] 배열명 = new 타입[i][j];
		int arr[][] = new int[2][4];
		
		// 2차원 배열의 크기
		// 가로 행 : arr.length
		// 세로 열 : arr[].length
		System.out.println(arr.length);		// 2
		System.out.println(arr[0].length);  // 4
		System.out.println(arr[1].length);  // 4
		
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[0][3] = 4;
		arr[1][0] = 5;
		arr[1][1] = 6;
		arr[1][2] = 7;
		arr[1][3] = 8;
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[0].length; j++) {
				System.out.println("arr["+i+"]="+arr[i][j]);
			}
		}
		
		int k = 8;
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j] = k--;
				System.out.println("arr["+i+"]="+arr[i][j]);
			}
		}
		
		
	}

}
