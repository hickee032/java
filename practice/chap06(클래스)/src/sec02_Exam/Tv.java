package sec02_Exam;

public class Tv {

	// tv�� �Ӽ�(attribute) ������� �ʵ�
	String color; // tv ����
	boolean power; // tv ����
	int channel; // tv�� ä��

	public Tv() {
		System.out.println("�⺻ ������ ȣ��");
	}

	// tv�� ������ ���� �Ѵ� ���
	// ��� �޼���
	void power() {
		this.power = !power;
		return; // �޼���� ���Ϲ��� ������ ��� ����
	}

	// tv�� ä���� ���̴� ���
	void channelUp() {

		if (this.channel < 0) {
			System.out.println("���̻� ä���� �����ϴ�.");
		}

		if (this.channel > 999) {
			System.out.println("���̻� ä���� �����ϴ�.");
			this.channel = 0;
		}

		this.channel++;
		return;
	}

	void channelDown() {

		if (this.channel < 0) {
			System.out.println("���̻� ä���� �����ϴ�.");
		}

		if (this.channel > 999) {
			System.out.println("���̻� ä���� �����ϴ�.");
			this.channel = 2;
		}
		this.channel--;
		return;
	}
}
