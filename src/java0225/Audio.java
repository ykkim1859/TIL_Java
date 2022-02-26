package java0225;

public class Audio implements RemoteControl{
	
	// 필드 선언
	private int volume;
	
	
	// 추상메소드 오버라이딩
	@Override
	public void turnOn() {
		System.out.println("Audio 킴");
	}
	
	@Override
	public void turnOff() {
		System.out.println("Audio 끔");
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
		
		System.out.println("현재 Audio 볼륨 : " + this.volume);
	}
	
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			System.out.println("Audio 음소거");
		} else {
			System.out.println("Audio 음소거 해제");
		}
	}
	
}
