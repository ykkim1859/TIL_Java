package java0224_2;

public class ComputerMain {

	public static void main(String[] args) {
		
		// com, dTop, note, mNote객체 생성
		// Computer com = new Computer();
		DeskTop dTop = new DeskTop();
		// NoteBook note = new NoteBook();
		MyNoteBook mNote = new MyNoteBook();
		
		// 추상클래스는 객체(instance)를 생성하지 못한다.
		// 추상클래스는 단순히 상속만을 하기 위해 만든 클래스다.
		
		// 1. 객체생성
		System.out.println("===== [1] 객체생성 =====");
		 dTop.display();
		 dTop.typing();
		 
		 mNote.display();
		 mNote.typing();
		
		// 2. 자동 타입 변환
		System.out.println("\n===== [2] 자동 타입 변환 =====");
		Computer com = null;
		com = dTop;
		com.display();
		com.typing();
		
		com = new MyNoteBook();
		com.display();
		com.typing();
		
		// 3. 유틸클래스
		System.out.println("\n===== [3] 유틸클래스 =====");
		// 유틸 객체 만들기
		ComputerUtil util = new ComputerUtil();
		util.ComputerMethod(dTop);
		util.ComputerMethod(mNote);
		
		
		
	}
}
