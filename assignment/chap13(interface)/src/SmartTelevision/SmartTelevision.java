package SmartTelevision;

public class SmartTelevision implements RemoteControl, Searchable {

	private int volume;

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");	
	}

	@Override
	public void smartSkill() {
		System.out.println("Smart 기능을 시작합니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume == 10) {
			System.out.print("볼륨의 최대치는 10입니다.");
			System.out.println("볼륨을 "+volume+"으로 지정합니다.");
			System.out.println("현재의 볼륨"+volume);
			}
		if(volume == 0) {
			System.out.print("볼륨의 최소치는 0입니다.");
			System.out.println("볼륨을 "+volume+"으로 지정합니다.");
			System.out.println("현재의 볼륨"+volume);
			}
		else {
			System.out.println("볼륨을 "+volume+"으로 지정합니다.");
			System.out.println("현재의 볼륨"+volume);
		}
	}

}
