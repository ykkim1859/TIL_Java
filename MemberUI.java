package ui;

import java.util.Scanner;

import action.Action;
import action.MemberListAction;
import action.MemberRegistAction;
import controller.MemberController;
import dto.Member;

public class MemberUI {
	
	public static Member memberArray[] = new Member[0];
	// memberArray를 static으로 선언하지 않으면 MemberUI의 모든 정보 가져가야 함
	// 하지만 memberArray를 static으로 선언한다면 이 부분만 가져가서 사용 가능

	// 3. 메소드
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int menu = 0;
		MemberController controller = new MemberController();
		
		do {
			Action action = null;
			System.out.println("--------------------------------------------");
			System.out.println("1. 회원가입	2. 회원목록보기	3. 회원정보수정");
			System.out.println("4. 회원정보삭제	5. 회원목록검색	6. 프로그램종료");
			System.out.println("--------------------------------------------");
			System.out.println("메뉴 선택 >> ");
			menu = sc.nextInt();			
			
			// DB -> CRUD : 저장하고C, 불러오고R, 수정하고U, 삭제하고D
			switch(menu) {
			case 1:
				// 회원가입 : C(Creat)
				// 회원가입 프로세스 
				// : 1. MemberUI에서 case 1 : action에 new MemberRegistAction(); 담음
				// : 2. action이 null 아닐 경우 MemberController에 processRequest(sc,action)으로 예외처리 작업 후 실행
				// : 3. MemberRegistAcion으로 이동해서 member 객체에 ConsoleUtil의 메소드 getNewMember() 실행
				// : 4. 회원정보 입력받음 => ConsoleUtil의 member객체에 저장
				// : 5. MemberService로 이동해서 중복여부 확인 후 중복이 되지 않았으면 배열의 크기를 1 증가 후 입력받는 정보(ConsoleUtil의 member객체 내용) 저장 후 중복여부(regist) 리턴
				// : 6. 중복일 경우 printRegistFail() 실행해서 실패 메시지 출력 / 중복 아니면 printRegistSuccess() 실행해서 성공 메시지 출력
				// : 7. 
				action = new MemberRegistAction();
				break;
			case 2:
				// 회원목록 : R(Read)
				action = new MemberListAction();
				break;
			case 3:
				// 회원수정 : U(Update)
				break;
			case 4:
				// 회원삭제 : D(Delete)
				break;
			case 5:
				// 회원검색 : R(Read)
				break;
			case 6:
				run = false;
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("다시 입력");
				break;
			}
			
			if(action != null) {
				controller.processRequest(sc, action);
			}
			
		} while(run);

	}

}
