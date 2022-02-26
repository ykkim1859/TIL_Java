package java0225;

import java.util.Scanner;

public class Remote_선생님 {

	public static void main(String[] args) {
		
		// 리모콘 제작
		// 오디오, tv, 스마트tv 중 선택 후
		// 전원on, 전원off
		// 볼륨 조절(볼륨 입력 받기)
		// 음소거(적용, 해제)
		// 스마트tv는 인터넷 검색기능도 추가
		
		Scanner sc = new Scanner(System.in);
		
		RemoteControl remote = null;	// implements 는 객체 만들 수 x / 기기 설정
		SmartTV stv = new SmartTV();	// 검색기능 위해 만든 것
		
		boolean run = true;
		boolean power = false;	// 전원
		
		System.out.println("\n====== Remote Controller ======");
		System.out.println("[1]Audio  [2]TV\t [3]SmartTV");
		System.out.println();
		System.out.println("기기 선택 >> ");
		int machine = sc.nextInt();
		
			switch(machine) {
			case 1 : 
				remote = new Audio();
				break;
				
			case 2 : 
				remote = new Television();
				break;
				
			case 3 : 
				remote = new SmartTV();
				break;
				
			default : 
				System.out.println("다시 입력");
				break;
			}
			
			if(remote!=null) {
				do {
					System.out.println("\n====== Remote Controller ======");
					System.out.println("[1]전원ON  [2]볼륨조절  [3]음소거  [4]인터넷검색  [5]전원OFF");
					System.out.println();
					System.out.println("기능 선택 >> ");
					int menu = sc.nextInt();
					
					switch(menu) {
					case 1: 
						remote.turnOn();
						power = true;
						break;
						
					case 2:
						if(power) {
							System.out.println("볼륨 입력 >> ");
							int vol = sc.nextInt();
							remote.setVolume(vol);
						} else {
							System.out.println("전원 먼저 켜주세요");
						}
						break;
						
					case 3:
						if(power) {
							System.out.println("음소거 여부 (Y / N)");
							String result = sc.next();
							if(result.equals("Y")||result.equals("y")) {
								remote.setMute(true);
							} else if(result.equals("N")||result.equals("n")) {
								remote.setMute(false);
							} else {
								System.out.println(" Y / N 중 하나를 입력하세요");
							}
						} else {
							System.out.println("전원 먼저 켜주세요");
						}
						break;
						
					case 4:
						if(power) {
							if(machine!=3) {
								System.out.println("해당기기 지원 안함");
							} else {
								System.out.println("검색할 사이트 입력");
								String url = sc.next();
								stv.search(url);
							}
						} else {
							System.out.println("전원 먼저 켜주세요");
						}
						break;
						
					case 5:
						if(power) {
							remote.turnOff();
							run = false;
						} else {
							System.out.println("전원 먼저 켜주세요");
						}
						break;
						
					default: 
						System.out.println("다시 입력");
						break;
					}
					
				} while(run);
			}
	}

}
