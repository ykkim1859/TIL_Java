package java0224;

public class Salesman2 extends Employee2{
	
	// 필드
	int commission;
	
	
	// 생성자
	public Salesman2() {
		super();
	}

	public Salesman2(String name, String dept, int salary, int commission) {
		super(name, dept, salary);
		// 상속받은 것 사용
		this.commission = commission;
	}
	
	
	// 메소드
	String getEmployeeInfo() {
		return "이름 : " + name + ", 부서 : " + dept + ", 급여 : " + salary
				+ ", 수당 : " + commission;
	}
	
	
}
