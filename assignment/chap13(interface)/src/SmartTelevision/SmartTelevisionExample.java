package SmartTelevision;

public class SmartTelevisionExample {

	public static void main(String[] args) {

		RemoteControl st = new SmartTelevision();
		st.turnOn();
		st.setVolume(10);
		st.setVolume(0);
		st.setVolume(8);
		
		st.setMute(true);
		st.setMute(false);
		
		st.turnOff();
		RemoteControl.changeBattery();
		
		Searchable se = new SmartTelevision();
		
		se.smartSkill();
		se.search("www.naver.com");
	}

}
