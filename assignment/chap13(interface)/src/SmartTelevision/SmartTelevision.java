package SmartTelevision;

public class SmartTelevision implements RemoteControl, Searchable {

	private int volume;

	@Override
	public void search(String url) {
		System.out.println(url + "�� �˻��մϴ�.");	
	}

	@Override
	public void smartSkill() {
		System.out.println("Smart ����� �����մϴ�.");
	}

	@Override
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume == 10) {
			System.out.print("������ �ִ�ġ�� 10�Դϴ�.");
			System.out.println("������ "+volume+"���� �����մϴ�.");
			System.out.println("������ ����"+volume);
			}
		if(volume == 0) {
			System.out.print("������ �ּ�ġ�� 0�Դϴ�.");
			System.out.println("������ "+volume+"���� �����մϴ�.");
			System.out.println("������ ����"+volume);
			}
		else {
			System.out.println("������ "+volume+"���� �����մϴ�.");
			System.out.println("������ ����"+volume);
		}
	}

}
