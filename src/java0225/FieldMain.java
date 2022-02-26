package java0225;

public class FieldMain {

	public static void main(String[] args) {
		
		// Field객체
		// Field fd = new Field();
		
		// 객체의 size, price 출력
		// System.out.println("fd.size : " + fd.size);
		// System.out.println("fd.price : " + fd.price);
		
		// static 변수는 객체생성 없이 바로 사용 가능
		// import static java0225.Field.*; 추가할 경우 Field.price가 아니라 price로 사용 가능
		System.out.println("Field.price : " + Field.price);
		
		Field number = new Field(2);
		// int iNum에 대입
		
		number.showInfo();
		// 이유 : 정수타입을 가져왔으나 어디로 보내야 할지 모르기에 데이터타입 중 가장 큰 int타입으로 보냄
		
		// byte로 출력 원할 시
		Field num = new Field((byte)3);
		num.showInfo();
		
	}

}
