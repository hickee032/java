package RemoteControl;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		RemoteControl t = new Television();
		t.turnOn();
		t.setVolume(10);
		t.setVolume(0);
		t.setMute(true);
		t.setMute(false);
		t.turnOff();
		RemoteControl.changeBattery();

	}

}
