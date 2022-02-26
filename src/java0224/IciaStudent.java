package java0224;

public class IciaStudent extends IciaPerson{

	String classroon;
	int grade;
	
	@Override
	void finish() {
		System.out.println("교육생은 5시 30분 퇴실");
	}
}
