package java0224_2;

public class DeskTop extends Computer{

	@Override
	public void display() {
		System.out.println("DeskTop display()");
	}

	@Override
	public void typing() {
		System.out.println("DeskTop typing()");
	}
	
	// NoteBook 클래스 생성 후 Computer클래스 상속 받기!
	// 추상메소드 재정의

}
