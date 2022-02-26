package java0221;

public class ex04_AirConMain2 {

	public static void main(String[] args) {
		// airCon1객체 생성 후 필드값 초기화(대입), 메소드 호출
		ex02_AirCon airCon1 = new ex02_AirCon();
		ex02_AirCon airCon2 = new ex02_AirCon();
		
		airCon1.company = "Samsung";
		airCon1.color = "White";
		airCon1.price = 160;
		airCon1.size = 25;
		airCon1.temp = 20;
		
		airCon2.company = "LG";
		airCon2.color = "BLACK";
		airCon2.price = 220;
		airCon2.size = 34;
		airCon2.temp = 18;
		
		System.out.println("======= airCon1 필드 ========");
		System.out.println("제조회사 : " + airCon1.company);
		System.out.println("제품색상 : " + airCon1.color);
		System.out.println("제품가격 : " + airCon1.price);
		System.out.println("제품크기 : " + airCon1.size);
		System.out.println("현재온도 : " + airCon1.temp);
		
		System.out.println("======= airCon2 필드 ========");
		System.out.println("제조회사 : " + airCon2.company);
		System.out.println("제품색상 : " + airCon2.color);
		System.out.println("제품가격 : " + airCon2.price);
		System.out.println("제품크기 : " + airCon2.size);
		System.out.println("현재온도 : " + airCon2.temp);
		
		
		System.out.println("\n======= airCon1 메소드 ========");		
		airCon1.onPower();
		airCon1.checkTemp();
		airCon1.upTemp(5);
		airCon1.checkTemp();
		airCon1.offPower();
		
		System.out.println("\n======= airCon2 메소드 ========");		
		airCon2.onPower();
		airCon2.checkTemp();
		airCon2.upTemp(5);
		airCon2.checkTemp();
		airCon2.offPower();

		
		airCon2 = airCon1;
		System.out.println("======= airCon2 = airCon1 필드 ========");
		System.out.println("제조회사 : " + airCon2.company);
		System.out.println("제품색상 : " + airCon2.color);
		System.out.println("제품가격 : " + airCon2.price);
		System.out.println("제품크기 : " + airCon2.size);
		System.out.println("현재온도 : " + airCon2.temp);
	}

}
