package java0223_1;

public class Aircon {
	
	// [1] private 필드 선언
	private String company;		
	private String color;				
	private int price;						
	private int size;						
	private int temp;	
	
	
	// [2] 기본생성자 : alr + shift + s => Generate Constructor using field
	// 체크 모두 해제 (Deselect All) 후 Generate
	public Aircon() {

	}

	
	// [3] getter, setter
	// alr + shift + s => getters and setters
	// 모두 선택 (Select All) 후 Generate
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public int getTemp() {
		return temp;
	}
	
	public void setTemp(int temp) {
		this.temp = temp;
	}
	
	
	// [4] toString()
	@Override
	public String toString() {
		return "Aircon [company=" + company + ", color=" + color + ", price=" + price + ", size=" + size + ", temp="
				+ temp + "]";
	}
	
}
