package java0224;

public class Salesman3 extends Employee3{

	String name = "노승한";
	
	String getNameLocal() {
		String name = "강새미";
		return name;	
	}
	
	String getNameThis() {
		String name = "조서영";
		return this.name;	
	}
	
	String getNameSuper() {
		String name = "김유라";
		return super.name;	
	}
	
	
}
