/**
   Date : 2022.02.16
   Author : ykkim1859
   Description : 배열 (Array)
   version : 1.0
 */

package java0216;

public class ex07_array {

	public static void main(String[] args) {
		// 배열 (Array) : 같은 변수 타입의 데이터를 하나의 변수에 저장하는 구조
		
		// 배열 선언 방법
		// 1. 타입[] 배열이름;
		// 2. 타입 배열이름[];
		
		int[] numArr1;
		int numArr2[];
		
		// 배열 초기화, 배열 할당
		numArr1 = new int[] {10,20};
		
		System.out.println(numArr1);
		
		System.out.println("첫번째방 : " + numArr1[0]);
		System.out.println("두번째방 : " + numArr1[1]);
		
		// 배열 선언 초기화
		int numArr3[] = {10,20,30,40};
		
		System.out.println("첫번째방 : " + numArr3[0]);
		System.out.println("두번째방 : " + numArr3[1]);
		System.out.println("세번째방 : " + numArr3[2]);
		System.out.println("네번째방 : " + numArr3[3]);
		
		// 배열 초기화
		int[] arr = null;
		int arr1[] = {};
		
		// 배열 값 입력시 타입 맞춰서 입력
		char char1[] = {'a','유','경'};
		String str1[] = {"인덱스0","인덱스1"};
		boolean bool1[] = {true,false};
		
		// 배열 크기 확인
		System.out.println("char1[]배열의 크기 : " + char1.length);
		
		// for문 이용해서 배열 값 확인
		for(int i=0; i<char1.length; i++) {
			System.out.println("char1[" + i + "] = " + char1[i]);
		}
		
		// char char1[]={A,김,유,경}; 출력 -> 다시 해
		System.out.print("char char1[]={");
		
		for(int i=0; i<char1.length; i++) {
			System.out.print(char1[i]);
			if(i<char1.length-1) {
				System.out.print("','");
			}
		}
		System.out.println("};");
		
		
		// 국어, 영어, 수학 점수를 저장하고 배열변수에 저장된
		// 모든 값의 총점과 평균 구하기
		
		int score[] = {80, 95, 100};
		int sum = 0;
		
		for(int i=0; i<score.length; i++) {
			System.out.println("score["+i+"] = " + score[i]);
			sum += score[i];
		}
		
		double avg = (double)sum / score.length;
		
		System.out.println("score[] 총점 : " + sum);
		System.out.println("score[] 평균 : " + avg);
	}
}

