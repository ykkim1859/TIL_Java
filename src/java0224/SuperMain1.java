package java0224;

public class SuperMain1 {

	public static void main(String[] args) {
		
		Salesman1 sales1 = new Salesman1();
		sales1.name = "김유경";
		sales1.dept = "개발팀";
		sales1.commission = 100;
			
		System.out.println("getEmployeeInfo()");
		System.out.println(sales1.getEmployeeInfo());
		
		System.out.println();
		
		System.out.println("getSalesman1Info()");
		System.out.println(sales1.getSalesman1Info());
		
		System.out.println();
		sales1.checkSuper();
		
	}

}
