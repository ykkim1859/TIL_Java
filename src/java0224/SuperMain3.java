package java0224;

public class SuperMain3 {

	public static void main(String[] args) {
		
		Salesman3 man3 = new Salesman3();
		
		System.out.println("name : " + man3.name);
		System.out.println("getNameLocal() : " + man3.getNameLocal());
		System.out.println("getNameThis() : " + man3.getNameThis());
		System.out.println("getNameSuper() : " + man3.getNameSuper());

	}

}
