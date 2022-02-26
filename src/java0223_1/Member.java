package java0223_1;

public class Member {
	
	// 1. String 타입의 아이디, 비밀번호, 이름, 생년월일, 이메일, 휴대전화를 필드로 선언
	private String id;
	private String pw;
	private String name;
	private String birth;
	private String email;
	private String phone;
	
	
	// 2. 기본생성자와 매개변수(모든 필드값) 생성자 선언
	public Member() {
		super();
	}
	
	public Member(String id, String pw, String name, String birth, String email, String phone) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.birth = birth;
		this.email = email;
		this.phone = phone;
	}


	// 3. getter, setter, toString 메소드 생성
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBirth() {
		return birth;
	}


	public void setBirth(String birth) {
		this.birth = birth;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", name=" + name + ", birth=" + birth + ", email=" + email
				+ ", phone=" + phone + "]";
	}
	
	
	
	
}
