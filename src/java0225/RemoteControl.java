package java0225;

public interface RemoteControl {
	
	/*
	
	 	- 인터페이스(interface)
	 	 : 누구나 접근 가능하도록 public 설정
	 	 : 객체의 다형성 구현 용이
	 	 : 인터페이스 구성요소
	 	 	(1)상수필드 : 일반적인 필드로 선언해도 컴파일 과정에서 static final이 자동으로 붙음
	 	 	(2)추상메소드 : 
	 	 	(3)디폴트메소드 : 기본으로 실행 내용까지 갖고 있는 메소드 / 기존 인터페이스 확장해서 새 기능 추가하기 위함
	 	 	(4)정적(static)메소드 : 인터페이스 개체화 안 해도 직접 호출 가능
	 	 : 부모클래스 변수 = new 자식클래스();
	 	   인터페이스 변수 = new 구현클래스();
	 	
	 */
	
	// (1)상수필드
	int MAX_VOLUME = 10;	// static final 사용하지 않아도 자동 적용
	int MIN_VOLUME = 0;
	
	// (2)추상메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// 기본 메소드 생성시 오류 발생
	// (3)default 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("TV 음소거");
		} else {
			System.out.println("TV 음소거 해제");
		}
	}
	
	// (4)static 메소드
	static void changeBattery() {
		System.out.println("건전지 교체");
	}
	
}
