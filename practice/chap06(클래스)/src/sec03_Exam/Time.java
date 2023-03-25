package sec03_Exam;

public class Time {

	/*
	 * ���� ������(Access Modifier) �� ���� 1. private : ���� Ŭ������������ ���ٰ��� 2. protected : ����
	 * ��Ű��, �ٸ� ��Ű�� �ڼ� Ŭ���������� ���ٰ��� 3. default : ���� ��Ű��, �ٸ� ��Ű�� ���ٰ��� 4. public : �
	 * Ŭ������ �� ���� ����
	 */

	private int hour;
	private int minute;
	private int secnond;

//--------------------------------------------	
	// private�� ������ ���������� �ݵ�� getter �޼��尡 �ʿ��ϴ�.
	// getter �޼��� : ��������� ���� ���������ϴ� ��
	public int getHour() {
		//
		return this.hour;
	}

	public void sethour(int hour) {
		//���� ó��
		if (hour < 0 || hour > 23) {
			System.out.println("�ð� �߸� �Է�");
			return;
		}
		this.hour = hour;
	}

	public int getMinute() {
		return this.minute;
	}

	public void setMinute(int minute) {
		if (minute < 0 || minute > 59) {
			System.out.println("�� �߸� �Է�");
			return;
		}
		this.minute = minute;
	}

	public int getSecnond() {
		return this.secnond;
	}

	public void setSecnond(int secnond) {
		if (secnond < 0 || secnond > 59) {
			System.out.println("�� �߸� �Է�");
			return;
		}
		this.secnond = secnond;
	}

// --------------------------------------------
	// objectŬ������ toString�޼��� ������ (�������̵�)��
	// this�� ���� �ڽ��� Ŭ������ �ǹ���.
	@Override
	public String toString() {
		String str = this.getHour() + ":" + this.getMinute() + ":" + this.getSecnond() + "��";
		return str;

	}

}
