package RemoteControl;

public class Television implements RemoteControl {

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume == 10) {
			System.out.print("������ �ִ�ġ�� 10�Դϴ�.");
			System.out.println("������ "+volume+" ���� �����մϴ�!");
			System.out.println("���� ����"+volume);
		}
		if(volume == 0) {
			System.out.print("������ �ּ�ġ�� 0�Դϴ�.");
			System.out.println("������ "+volume+" ���� �����մϴ�!");
			System.out.println("���� ����"+volume);
		}
		
	}
	

}
