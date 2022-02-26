package java0225;

public class RemoteMain {

	public static void main(String[] args) {
		
		// [1] 객체 생성
		Audio audio = new Audio();	
		
		audio.turnOn();
		audio.setVolume(50);
		audio.setMute(true);
		audio.turnOff();
		System.out.println();
		
		// [2] 자동 타입 변환
		RemoteControl rc = null;	// 추상메소드라서
		rc = new Television();
		
		rc.turnOn();
		rc.setVolume(-1);
		rc.setMute(false);
		rc.turnOff();
		System.out.println();
		
		// [3] 유틸클래스 활용
		RemoteInfo remote = new RemoteInfo();
		remote.Info(new SmartTV(), "네이버", 8, true);
		System.out.println();
		
		remote.Info(audio, 4, false);
		System.out.println();
		remote.Info(rc, -3, false);
		System.out.println();
		
		
	}

}
