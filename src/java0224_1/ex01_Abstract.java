package java0224_1;

public abstract class ex01_Abstract {
	
	abstract void sound();
	
	/*
	
		<면접질문 best>
		1. 오버로딩과 오버라이딩의 차이점
		2. 추상클래스와 인터페이스의 차이점
		
		* 추상클래스(Abstract Class)
		 - 구체적이지 않은 클래스
		 - 추상메소드 반드시 포함
		 - 자식클래스에서 반드시 재정의
		 - 자식클래스의 규격 정의 : 메소드를 어떻게 구체화할 것인지
		 - 객체가 될 수 없음
		 
		 - 일반 메소드
		 void 메소드명(){
		 
		 }
		 
		 - 추상 메소드
		  : 맨 앞에 abstract 선언
		  : {구현부} 없이 이름만 선언
		  : 접근제한자 뒤, 클래스 앞에 abstract 선언하여 오류 해결
		 abstract 데이터타입 메소드명();
		
	*/

}
