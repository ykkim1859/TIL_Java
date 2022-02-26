package java0223_1;

public class MemberMain {

	public static void main(String[] args) {
		// 기본생성자 사용해서 member1 객체 만든 후 member1의 정보 저장
		Member member1 = new Member();
		
		member1.setId("ykkim1859");
		member1.setPw("yk27277@");
		member1.setName("김유경");
		member1.setBirth("960925");
		member1.setEmail("ykkim1859@naver.com");
		member1.setPhone("01032711849");
		
		System.out.println(member1);
		
		
		// 매개변수 생성자 사용해서 member2 객체 만들기
		Member member2 = new Member("ylkim1849","yl27277@","김유라","971206","ylkim1849@naver.com","01099081849");
		
		Member member3 = new Member();
		
		member3.setId("tmdgks0531");
		member3.setPw("dkssud@");
		member3.setName("노승한");
		member3.setBirth("940531");
		member3.setEmail("tmdgks0531@naver.com");
		member3.setPhone("01021220532");
		
		Member member4 = new Member();
		
		member4.setId("seami5270");
		member4.setPw("hisaemi");
		member4.setName("강새미");
		member4.setBirth("960527");
		member4.setEmail("saemi0527@naver.com");
		member4.setPhone("01049225270");
		
		// Member타입 배열 members 생성
		// String타입 배열 : String arr[] = new String[4];
		
		Member members[] = new Member[4];
		
		members[0] = member1;
		members[1] = member2;
		members[2] = member3;
		members[3] = member4;
		
		// for문 사용해서 4명 id 확인
		for(int i=0; i<members.length; i++) {
			System.out.println("member" + "[" + i + "] 의 id : " + (members[i].getId()));
		}
		
		System.out.println();
		
		for(int i=0; i<members.length; i++) {
			System.out.println("member" + "[" + i + "] : " + members[i]);
		}
	}

}
