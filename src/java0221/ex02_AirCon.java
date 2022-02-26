/**
   Date : 2022.02.21
   Author : inchoriya
   Description : AirCon클래스
   version : 1.0
 */
package java0221;

public class ex02_AirCon {
	
	// 클래스의 3요소 : 필드, 생성자, 메소드
	// 꼭 외 우 기 !!
	
	// (1) 필드(특성, 상태, 속성) : 변수 정의
	String company="Samsung";		// 제조회사
	String color;					// 제품색상
	int price;						// 제품가격
	int size;						// 제품크기
	int temp;						// 현재온도
	
	
	// (2) 생성자
	
	
	// 1) 기본생성자
	/*
  		클래스명() {
  	
  		}
  		
  		- 리턴타입을 쓰지 않는다.
  		- Java 컴파일러가 기본적으로 생성자가 없으면 자동으로 기본생성자를 생성한다.
  		- 매개변수 생성자가 있을 경우, 반드시 기본생성자를 만들어줘야 한다.
  	
	 */
	ex02_AirCon(){
		// 괄호 안에 아무것도 들어가지 않는 것을 기본 생성자라 함
	}
	
	
	// 2) 매개변수 생성자
	/*
		클래스명(데이터타입 매개변수) {
			this.맴버변수(필드) = 매개변수;
		}
		
		- 매개변수랑 필드의 이름이 같을 경우
		- 필드에 저장할 변수 이름 앞에 this를 붙인다.
		- 매개변수의 갯수, 타입에 대해 여러개 생성가능
		 
	 */
	
	ex02_AirCon(String company){
		
		this.company = company;
		
	}
	
	ex02_AirCon(String company, int price){
		
		this.company = company;
		this.price = price;
		
	}
	
	ex02_AirCon(int price, String company){
		
		this.company = company;
		this.price = price;
		
	}
	
	// 회사 색상 가격
	// 매개변수를 넣을 때는 순서에 유의!!
	ex02_AirCon(String company, String color, int price){
		this.price = price;
		this.color = color;
		this.company = company;
		// 생성자 안에 있는 내용은 순서가 바껴도 상관이 없다.
	}
	
	// 회사를 제외한 나머지 필드값을 포함한 생성자
	ex02_AirCon(String color, int price, int size, int temp){
		this.price = price;
		this.color = color;
		this.size = size;
		this.temp = temp;
	}
	
	// 모든 필드값을 포함한 매개변수 생성자!
	public ex02_AirCon(String company, String color, int price, int size, int temp) {
		this.company = company;
		this.color = color;
		this.price = price;
		this.size = size;
		this.temp = temp;
	}


	// (3) 메소드
	// 메소드, 함수의 공통점!! 차이점!!!!!!!!!
	
	// 전원on
	public void onPower() {
		System.out.println("에어컨의 전원을 켭니다.");
	}
	
	// 전원off
	public void offPower() {
		System.out.println("에어컨의 전원을 끕니다.");
	}
	
	// 온도↑
	public int upTemp(int temp5) {
		temp += temp5;
		return temp;
	}
	// public int upTemp() {
	// return ++temp;
	// }
	
	// 온도↓
	public int downTemp() {
		return --temp;
	}
	
	// 현재온도 확인
	public void checkTemp() {
		System.out.println("현재온도는 " + temp + "℃ 입니다.");
	}

	
	// toString() 메소드 : String타입의 메소드, String타입의 return값을 갖는다.
	// 오른쪽 마우스 → Source( [Alt] + [Shift] + [S] ) → Generate toString() 선택
	// → Field 모두 체크 → Generate 클릭
	@Override
	public String toString() {
		return "ex02_AirCon [company=" + company + ", color=" + color + 
				", price=" + price + ", size=" + size + ", temp=" + temp + "]";
	}
	


	
	
	
	
	
	
	
	

}
