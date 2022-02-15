/**
   Date : 2022.02.14
   Author : ykkim1859
   Description : 연산자 (operator)
   version : 1.0
 */

package java0214;

public class ex07_operator {

	public static void main(String[] args) {
		// 단항연산자
		// [1] 증감연산자 : 증가, 감소 연산자( ++ , -- ) : 1씩 증가시키거나 감소시키거나
		
		// ++num : num이 가지고 있는 값에 1을 증가한 뒤에 연산에 적용(출력)
		// num++ : num이 가지고 있는 값을 연산에 적용(출력)한 뒤 1을 증가
		
		int num = 10;
		System.out.println("++num : " + ++num);	// 결과 : 11
		System.out.println("num++ : " + num++);	// 결과 : 11
		System.out.println("num : " + num);	// 결과 : 12
		
		int num1 = 10;
		
		int num2 = 10;
		int num3 = 10;
		
		System.out.println("num1 + (++num2) : " + (num1 + (++num2)));	// 결과 : 21
		System.out.println("num1 + (num3++) : " + (num1 + (num3++)));	// 결과 : 20
		
		System.out.println("num2 : " + num2);	// 결과 : 11
		System.out.println("num3 : " + num3);	// 결과 : 11
		
		
		
		
		
		// 이항연산자
		// [2] 대입연산자
		// 왼쪽 : 변수 = 오른쪽 : 상수, 변수, 식
		// (1) 변수 = 상수;
		int age = 35;
		int age1 = 25;
		
		// (2) 변수 = 변수
		age = age1;
		
		// (3) 변수 = 식(변수+변수, 상수+상수, 변수+상수)
		age1 = age + 10;
		
		// 수학 => 왼쪽 계산 , 오른쪽 값
		// 코딩 => 오른쪽 계산 , 왼쪽 값
		
		
		// [3] 산술연산자 : 정수형 or 실수형 데이터를 사용
		// + , - , * , / , % 등등
		// 우리가 흔히 알고 있는 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지를 구할 때 사용
		
		// [4] 비교(관계)연산자 : 정수형 or 실수형 데이터를 사용
		// 부등호를 이용해서 크다, 작다, 크거나같다, 작거나같다, 같다, 다르다
		// > , < , >=, <= , == , !=
		
		// [5] 논리연산자 : 논리형 데이터 사용
		// (1) AND연산( && )
		//  : A && B 일때 A, B가 모두 true일때 결과가 true
		//  : A, B중에 하나라도 false가 있다면 결과는 false
		
		// (2) OR연산( || )  
		//  : A || B 일때 A, B가 모두 false일때 결과가 false
		//  : A, B중에 하나라도 true가 있다면 결과는 true
		
		// (3) NOT연산( ! ) 
		//  : A가 true일 때 !A와 같이 사용하면 결과는 false
		//  : A가 false일 때 !A와 같이 사용하면 결과는 true
		//  : A가 true일 때 !!A와 같이 사용하면 결과는 true
		
		
		// 삼항연산자
		// [6] 조건연산자
	
		int numb1 = 20;
		int numb2 = 30;
		
		char resultChar;
		int resultInt;
		String resultStr;
		
		// (조건식) ? 참일때 : 거짓일때
		resultChar = numb1 < numb2 ? 'O' : 'X';
		
		resultInt = numb1 < numb2 ? 1 : 0 ;
		
		resultStr = numb1 < numb2 ? "참일경우" : "거짓일경우";
		
		System.out.println("resultChar : " + resultChar);
		System.out.println("resultInt : " + resultInt);
		System.out.println("resultStr : " + resultStr);

	}

}