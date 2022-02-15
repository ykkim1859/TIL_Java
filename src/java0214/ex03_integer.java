/**
   Date : 2022.02.14
   Author : ykkim1859
   Description : 정수형 실수형 데이터타입
   version : 1.0
 */
package java0214;

public class ex03_integer {

	public static void main(String[] args) {
		// [1] 정수형 데이터 타입
		
		// (1) byte
		// 1byte = 8bit
		//       = -2^7 ~ (2^7 - 1)
		//       = -128 ~ 127
		byte bNum1 = -128;
		byte bNum2 = 127;
		
		
		// (2) short
		// 2byte = 16bit
		//       = -2^15 ~ (2^15 - 1)
		//       = -32768 ~ 32767
		short sNum1 = -32768;
		short sNum2 = 32767;
		
		// (3) int
		// 4byte = 32bit
		//       = -2^31 ~ (2^31 - 1)
		//       = -2,147,483,648 ~ 2,147,483,647
		int iNum1 = -2147483648;
		int iNum2 = 2147483647;
		
		// (4) long
		// 8byte = 64bit
		//       = -2^63 ~ (2^63 - 1)
		//       = 매우 크다
		
		long lNum1 = -2147483649L;
		long lNum2 =  2147483648L;
		
		System.out.println("lNum1 : " + lNum1);
		System.out.println("lNum2 : " + lNum2);
		// 변수값에는 L을 썻지만 출력은 되지 않는다.
		
		// [2] 실수형 데이터 타입 
		// (1) float : 4byte
		float fNum1 = 123.456f;
		
		// (2) double : 8byte
		double dNum1 = 123.456;

	}

}
