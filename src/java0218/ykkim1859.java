package java0218;

import java.util.Scanner;

public class ykkim1859 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		String color = "";
		int pNum = 0;
		int price = 0;
		int slt[] = {0,0,0,0};
		
		System.out.println();
		System.out.println("안녕하세요 인생네컷 사진관에 오신 걸 환영합니다! :)");
	
		while(run){
			System.out.println("\n============= 인 생 네 컷 =============");
			System.out.println("[1]프레임 색상\t\t[2]사진 장수");
			System.out.println("[3]결제 후 사진찍기\t\t[4]종료");
			System.out.println();
			System.out.println("메뉴 선택 >> ");
			int menu = sc.nextInt();
			
			int frame;
			switch(menu) {
			case 1 : 
				// 색상 선택
				System.out.println();
				System.out.println("사진 프레임 색상 선택! >> ");
				System.out.println("[1]black\t[2]white");
				System.out.println("[3]pink\t\t[4]blue");
				frame = sc.nextInt();
				
				switch(frame) {
				case 1 :
					color = "black";
					slt[0] += 1;
					System.out.println("black 선택횟수 : " + slt[0]);
					break;
					
				case 2 :
					color = "white";
					slt[1] += 1;
					System.out.println("white 선택횟수 : " + slt[1]);
					break;
					
				case 3 : 
					color = "pink";
					slt[2] += 1;
					System.out.println("pink 선택횟수 : " + slt[2]);
					break;
					
				case 4 : 
					color = "blue";
					slt[3] += 1;
					System.out.println("blue 선택횟수 : " + slt[3]);
					break;
		
				default : 
					System.out.println("1 ~ 4 중 다시 선택!!!");
					break;
				}
				
				break;
				
			case 2 : 
				// 장수 입력
				System.out.println("원하는 사진 장수 입력! >> ");
				pNum = sc.nextInt();
				if(pNum<=0) {
					System.out.println("1장 이상 입력 가능합니다\n");
					System.out.println("원하는 사진 장수 입력! >> ");
					pNum = sc.nextInt();
				} 
				break;
				
			case 3 : 
				// 결제 후 사진찍기
				System.out.println("사진은 장당 2000원 입니다!");
				System.out.println("========================");
				price = (2000 * pNum);
				if(price>=2000) {
					System.out.println("사진 프레임 색상 : " + color);
					System.out.println("사진 장수 : " + pNum);
					System.out.println("결제 금액 : " + price);
				}
				break;
				
			case 4 : 
				// 결제하기(종료)
				run = false;
				System.out.print("이용해주셔서 감사합니다~!");
				break;
				
			default : 
				System.out.print("다시 입력하세요!!!");
				break;
			}
		
		}
	
	}
}


