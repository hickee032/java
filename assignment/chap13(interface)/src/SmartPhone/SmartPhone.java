package SmartPhone;

public class SmartPhone extends PDA implements MobilePhone, MP3 {

	public void scheduler() {
		System.out.println("���������� ���� �մϴ�.");
	}

	public void applicationManager() {
		System.out.println("�ش���� ��ġ �� ������ �����մϴ�.");
	}

	@Override
	public void play() {
		System.out.println("MP3�� ������ Ƶ�ϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("MP3�� ������ �����մϴ�.");
	}

	@Override
	public void sendCall() {

		System.out.println("��ȭ�� �ɾ�ϴ�.");
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ �޽��ϴ�.");
	}

	@Override
	public void sendSMS() {
		System.out.println("���ڸ� �����ϴ�.");
	}

	@Override
	public void receiveSMS() {
		System.out.println("���ڸ� �޽��ϴ�.");
	}

}
