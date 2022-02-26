package java0223_1;

public class CarMain {

	public static void main(String[] args) {
		// Car 클래스의 car 객체 생성
		Car car = new Car();
		
		// car에 대한 특성 결정(값 대입) 후 
		car.setColor("white");
		car.setSpeed(180);
		car.setType("Gasoline");
		car.setModel("Minicooper");
		
		System.out.println(car.getModel());
		
		// showInfo() 메소드로 출력
		car.showInfo();

	}

}
