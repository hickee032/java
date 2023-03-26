package RemoteControl;

public class Audio implements RemoteControl {

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume == 10) {
			System.out.print("������ �ִ�ġ�� " + MAX_VOLUME + "�Դϴ�.");
			System.out.println("������ " + volume + " ���� �����մϴ�!");
		}
		if (volume == 0) {
			System.out.print("������ �ּ�ġ��" + MIN_VOLUME + "�Դϴ�.");
			System.out.println("������ " + volume + " ���� �����մϴ�!");
		}
	}

}
