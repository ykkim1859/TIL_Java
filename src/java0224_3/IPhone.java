package java0224_3;

public class IPhone extends SmartPhone{

	@Override
	int getPrice() {
		int price = 130;
		return price;
	}

	@Override
	String getBrand() {
		String brand = "Apple";
		return brand;
	}

	@Override
	String getModel() {
		String model = "iPhone13";
		return model;
	}

}
