package java0223;

public class ex01_Factorial {
	/*
	  3. 메소드
	  	(1) int getFactorial(int num) : 매개변수로 전송된 숫자의 팩토리얼 값을 구해서 리턴
	  		ex ) int num = 5인 경우 5*4*3*2*1
	*/
	
	int fact;
	int num;
	
	int getFactorial(int num) {
		
		int fact = 1;
		System.out.println("num : " + num);
		System.out.println();
		
		for(int i=num; i>0; i--) {
			fact *= i;		// fact = fact * i;
			System.out.println("fact : " + fact);
			System.out.println("i : " + i);
			
		}
		
		return fact;
		
	}
	
	
	/*
	 	3. 메소드
	 		(2) int getPower(int num) : 매개변수로 전송된 값까지의 제곱의 합 구하기
		  	ex) int num = 3인 경우 (1*1)+(2*2)+(3*3)
	*/
	
		int power;
	
		int getPower(int num) {
		
			int power = 0;
		
			for(int i=1; i<=num; i++) {
				power += i*i;		// power = power + (i*i)
				System.out.println("power : " + power);
				System.out.println("i*i : " + (i*i));
		
	}
			return power; // 리턴값부터 선언
}
}
