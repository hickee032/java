package CellPhone;

public class CellPhone {

	String model;
	String color;

	public void powerOn() {
		System.out.println("������ �մϴ�.");
	}

	public void powerOff() {
		System.out.println("������ ���ϴ�.");

	}

	public void bell() {
		System.out.println("���� �����");

	}

	public void sendVoice() {
		System.out.println("��: ��������");
		this.receiveVoice();
		System.out.println("��: ������");

	}

	public void receiveVoice() {
		System.out.print("���� : ");
		System.out.println("�������� ���Ϸ��� �մϴ�.");
	}

	public void hangUp() {
		System.out.println("��ȭ ����");
	}
}
