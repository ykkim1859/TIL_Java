package controller;

//import java.awt.Desktop.Action;
import action.Action;
import java.util.Scanner;

public class MemberController {

	public void processRequest(Scanner sc, Action action) {
		// 예외처리
		/*
			try {
			
				예외처리가 발생할 수 있는 코드 
				: ex) 10/0
				
			} catch(예외클래스 변수) {
			
				예외처리가 발생했을 경우 처리하는 코드 
				: 어떤 오류가 발생했는지 or 그 문제 해결할 수 있는 코드 작성
				ex) 0을 1로 바꿈
				
			}
		
		*/
		
		try {
			action.execute(sc);
			// Action interface의 execute(sc)메소드 실행했을 경우 
		} catch(Exception e) {
			e.printStackTrace();
			// e.printStackTrace()를 실행
		}
	}
}
