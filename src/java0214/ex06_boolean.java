/**
   Date : 2022.02.14
   Author : ykkim1859
   Description : 논리형 boolean
   version : 1.0
 */

package java0214;

public class ex06_boolean {

	public static void main(String[] args) {
		// 논리형 데이터타입 : (기본형)
		// 맞다/틀리다 : O/X : true/false
		
		boolean bool1 = true;
		boolean bool2 = false;
		
		boolean result;
		
		int num1 = 5, num2 = 3;
		
		result = num1 > num2;
		System.out.println(result);
		
		result = num1 < num2;
		System.out.println(result);
		
		//System.out.println("결과  :   " + result);
		
		if(num1>num2) {
			result = true;
		} else {
			result = false;
		}

	}

}
