/**
   Date : 2022.02.21
   Author : inchoriya
   Description : 자바 클래스
   version : 1.0
 */
package java0221;

public class ex01_OOP {

	public static void main(String[] args) {
		/*
		 
		 [1] 자바는 객체 지향 프로그래밍이다.
		 - OOP(Object - Oriented - Programming)
		 - 프로그래밍 하기 위해 단위(객체)로 나눠서 코딩
		 - 다시 이것들을 조립해서 하나의 프로그램을 만드는 것
		 
		 [2] 절차지향 vs 객체지향
		 
		 - 절차지향 : 순서대로 진행되는 프로그램
		   ex) 급식소에서 줄을 서서 밥을 먹는 것
		  	   맞춤옷 : 원하는 형태로 만들어서 입는 것
		 
		 - 객체지향 : 객체(클래스)라는 작은 단위로 프로그래밍 하는 것
		   ex) 부페에서 내가 원하는 음식을 가져와서 먹는 것
		       기성옷 : 내몸에 맞는 것을 골라서 입는 것
		       단점 => 불필요한 메모리가 생길 수 있음
		       
		 [3] 객체 모델링(Object Modeling) : 현실 세계의 객체를 소프트웨어 객체로 설계하는 것
		 	
		 	- 객체(Object)
		 	  (1) 다른 것과 식별이 가능한 것
		 	  (2) 자신만의 고유한 특성과 행동을 가지며, 다른 객체들과 상호작용을 한다.
		 	  (3) 클래스에서는 인스턴스(instance)라고 부른다.
		 	  
		 	- 객체의 특성 3가지
		 	  (1) 캡슐화(Encapsulation) : 정보은닉
		 	  (2) 상속(Inheritance) : 부모 - 자식
		 	  (3) 다형성(Polymorphism) : 상속에서 사용, 같은 코드 - 다른 출력
		 	  

		 [4] 클래스와 객체
		 
		 	- 클래스(Class) : 설계도
		 	  객체를 정의해 놓은 것, 객체를 만들기 위한 것
		 	  ex) 스마트폰 설계도
		 		
		 	- 객체(Object) : 실제로 존재하는 사물이나 개념
		 	  클래스 모양 그대로 생성된 실체
		 	  ex) 스마트폰
		 	  
		 [5] 클래스의 3요소
		 
		 	(접근제한자) class 클래스명 {
		 		필드 정의;
		 		생성자 정의;
		 		메소드 정의;
		 	}
		 	
		 	(1) 필드(field) : 속성, 상태, 특성
		 	    : 명사형
		 	    : 맴버변수라고도 함
		 	    : 값의 상태를 관리
		 	    : 데이터를 저장하는 공간
		 	    : ex) int size;
		 	    
		 	(2) 생성자(constructor)
		 		: 객체를 만들 때 따라야 하는 규칙 정의
		 		: 객체생성을 도와주는 블록
		 		: 생성자 이름은 클래스 이름과 동일
		 		: ex) Scanner sc = new Scanner(System.in);
		 	
		 	(3) 메소드(method) : 동작, 행동, 기능 => 명령
		 		: 동사형, 함수
		 		: 특정기능을 정의한 블록
		 		: 메소드가 호출되면 자신이 가지고 있는 기능을 수행
		 		: 기능 수행이 끝나면 return값 존재(void타입 제외)
		 */
		
	}
	
	public int methodInt() {
		return 0;
		
	}
	
	public void methodVoid() {
		// return;
		// return 적어줄 수 있지만 데이터 반환하는 것이 아니므로 생략 
	}
}

	







