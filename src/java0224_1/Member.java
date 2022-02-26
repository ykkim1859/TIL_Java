package java0224_1;

public class Member {

	// [1] 필드
	private String name;
	private String id;
	private String password;
	private int age;
	
	
	// [2] 생성자 (2개 : 기본, 매개변수)
	public Member() {
		super();
	}
	
	public Member(String name, String id, String password, int age) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}
	
	
	// [3] 메소드(getter, setter, toString)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", id=" + id + ", password=" + password + ", age=" + age + "]";
	}
	
	
	// [4] 추가메소드(login, logout)
	public boolean login(String id, String password) {
		
		if(id.equals("ykkim1859") && password.equals("yk27277@")) {
			return true;
		} else {
			return false;
		}
	}
	
	void logout(String id) {
		if(id.equals("ykkim1859")) {
			System.out.println(id + "님 로그아웃");
		}
	}
	
	
}
