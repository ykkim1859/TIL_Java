package java0225;

public class Television implements RemoteControl{

	// RemoteControl 인터페이스 상속받아서 
	// Television 클래스 완성
	
		// 필드 선언
		private int volume;
		
		
		// 추상메소드 오버라이딩
		@Override
		public void turnOn() {
			System.out.println("TV 킴");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV 끔");
		}
		
		@Override
		public void setVolume(int volume) {
			if(volume>RemoteControl.MAX_VOLUME) {
				this.volume = RemoteControl.MAX_VOLUME;
			} else if(volume<RemoteControl.MIN_VOLUME){
				this.volume = RemoteControl.MIN_VOLUME;
			} else {
				this.volume = volume;
			}
			
			System.out.println("현재 TV 볼륨 : " + this.volume);
		}
		
		// default 메소드 삭제
		
}
