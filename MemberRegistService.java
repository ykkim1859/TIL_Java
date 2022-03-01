package service;

import dto.Member;
import ui.MemberUI;

public class MemberRegistService {
	
	public boolean registMember(Member member) throws Exception {
		
		boolean regist = true;
		// 회원가입 여부 확인하기 위한 변수 regist를 true로 선언
		
		for(int i=0; i<MemberUI.memberArray.length; i++) {
			// MemberUI.memberArray.length : 가입 인원 없을 경우 0부터 시작
			
			if(MemberUI.memberArray[i].getStuNum() == member.getStuNum()) {
				// memberArray[i].getStuNum() : 가입된 회원 학생번호
				// member.getStuNum() : 가입할 회원 학생번호
				
				// 학생번호의 중복 막기 위해 실행
				// 가입된 회원의 학생번호와 가입할 회원의 학생번호가 같을 경우
				regist = false;
				// 중복된 학생 번호 있을 경우 가입 불가능
				break;
				// 중복에 걸리면 더 이상 for문 돌릴 필요 없기에 break
			}
			
		}
		
		// 중복에 해당되지 않으면 regist = true; / 중복에 해당되면 regist = false;
		
		if(regist) {
			// temp : 비어있는 공간 / tempArray : 비어있는 배열
			
			Member tempArray[] = MemberUI.memberArray;
			// 비어있는 배열 tempArray에 기존 가입된 회원 배열을 대입
			
			MemberUI.memberArray = new Member[MemberUI.memberArray.length + 1];
			// 기존 array값에 1 추가됨 / 3칸이었다면 +1 해서 4칸으로
			
			for(int i=0; i<tempArray.length; i++) {
				MemberUI.memberArray[i] = tempArray[i];
				// tempArray를 memberArray에 대입
			}
			MemberUI.memberArray[MemberUI.memberArray.length-1] = member;
			
		}
		
		return regist;
		
	}
}
