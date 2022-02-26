package java0225;

public class SmartTV implements RemoteControl, InternetSearch{
	
	private int volume;
	
	@Override
	public void search(String url) {
		System.out.println(url + "에서 검색");
	}

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
	
}
