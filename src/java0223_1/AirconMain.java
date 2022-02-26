package java0223_1;

public class AirconMain {

	public static void main(String[] args) {
		
		// airCon 객체 생성
		Aircon aircon = new Aircon();
		
		// 제조사 "Samsung"으로 저장
		aircon.setCompany("Samsung");
		
		
		// airCon 객체의 제조사 출력
		System.out.println("aircon 제조사 : " + aircon.getCompany());

	}

}
