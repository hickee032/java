package RemoteControl;

public class Audio implements RemoteControl {

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume == 10) {
			System.out.print("볼륨의 최대치는 " + MAX_VOLUME + "입니다.");
			System.out.println("볼륨을 " + volume + " 으로 지정합니다!");
		}
		if (volume == 0) {
			System.out.print("볼륨의 최소치는" + MIN_VOLUME + "입니다.");
			System.out.println("볼륨을 " + volume + " 으로 지정합니다!");
		}
	}

}
