package java0225;

import java.util.Scanner;

public class Remote_나 {

	public static void main(String[] args) {
		
		// 리모콘 제작
		// 오디오, tv, 스마트tv 중 선택 후
		// 전원on, 전원off
		// 볼륨 조절(볼륨 입력 받기)
		// 음소거(적용, 해제)
		// 스마트tv는 인터넷 검색기능도 추가
		
		// RemoteMain 사용하지 않고 만들기
		
		Scanner sc = new Scanner(System.in);
		
		RemoteControl remote = null;
		SmartTV stv = new SmartTV();
		
		boolean run = true;
		boolean power = true;
		
		System.out.println("\n====== Remote Controller ======");
		System.out.println("[1]Audio  [2]TV\t [3]SmartTV");
		System.out.println();
		System.out.println("기기 선택 >> ");
		int machine = sc.nextInt();
		
		switch(machine) {
		case 1:
			remote = new Audio();
			break;
			
		case 2:
			remote = new Television();
			break;
			
		case 3:
			remote = new SmartTV();
			break;
			
		default: 
			System.out.println("1~3 중 다시 입력");
			break;
		}
		
		if(remote!=null) {
			while(run) {
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
					System.out.println("볼륨 입력 >> ");
					int vol = sc.nextInt();
					remote.setVolume(vol);
					break;
					
				case 3:
					System.out.println("음소거? (Y/N)");
					String result = sc.next();
					if(result.equals("Y") || result.equals("y")) {
						System.out.println("음소거");
						remote.setMute(true);
					} else if(result.equals("N") || result.equals("n")) {
						System.out.println("음소거 해제");
						remote.setMute(false);
					} else {
						System.out.println("Y / N 중 하나 입력");
					}
					break;
					
				case 4:
					if(machine==3) {
						System.out.println("검색할 사이트 입력");
						String url = sc.next();
						stv.search(url);
					} else {
						System.out.println("해당 기기 지원x");
					}
					break;
					
				case 5:
					remote.turnOff();
					run = false;
					break;
					
				default:
					System.out.println("1~5 중 다시 입력");
					break;
				}
			}
		}
		

	}

}
