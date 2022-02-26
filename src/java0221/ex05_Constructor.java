package java0221;

public class ex05_Constructor {

	public static void main(String[] args) {
		
		// 제조회사 : Samsung
		// 제품색상 : white
		// 제품가격 : 160
		// 제품크기 : 25
		// 현재온도 : 20
		
		// 생성자 오버로딩 : 생성자의 이름은 같지만 받는 파라미터(매개변수)가 다른 생성자!
		
		// 기본생성자를 활용한 방법!
		ex02_AirCon airCon = new ex02_AirCon();
		airCon.company = "Samsung";
		airCon.color = "white";
		airCon.price = 160;
		
		// 매개변수생성자를 활용한 방법!
		ex02_AirCon airCon2 = new ex02_AirCon("Samsung", "white", 160, 25, 20);
		
		// 회사, 색상, 가격 매개변수 생성자 만들기!
		ex02_AirCon airCon3 = new ex02_AirCon("LG",220);
		// (1) 매개변수에 사이즈와 현재온도를 추가하는 방법
		// (2) 매개변수에 색상을 제거하는 방법
		// (3) AirCon 클래스에서 지정해준 매개변수 생성자에 따라서 넣을 수 있는 매개변수의 종류가 달라진다.
		// (4) 매개변수를 넣을 때는 순서에 유의!!
		
//		System.out.println("회사 : " + airCon3.company);
//		System.out.println("색상 : " + airCon3.color);
//		System.out.println("가격 : " + airCon3.price);
		
		// System.out.println(airCon3.toString());
		System.out.println(airCon3);
		
		

	}

}
