package dto;

//dto(Data Transfer Object) : 데이터 전송 객체 / 패키지(계층)간 데이터 교환을 위한 객체
// 							  bean, vo(Value object)로 사용하기도 함

public class Member {

	// 1. 필드
	private int stuNum;
	private String fName;
	private int age;
	private String phone;
	private String addr;
	private String fEmail;
	private String hobby;
	
	
	
	// 2. 생성자 - 보통 기본 생성자 사용 / 기본생성자만 사용시 생략 가능
	
	
	// 3. 메소드
	public int getStuNum() {
		return stuNum;
	}
	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getfEmail() {
		return fEmail;
	}
	public void setfEmail(String fEmail) {
		this.fEmail = fEmail;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	@Override
	public String toString() {
		return fName + "님 회원정보 [학생번호 : " + stuNum + ", 나이 : " + age + ", 전화번호 : " + phone + ", 주소 : " + addr
				+ ", 이메일 : " + fEmail + ", 취미 : " + hobby + "]";
	}
	
	
	
}
