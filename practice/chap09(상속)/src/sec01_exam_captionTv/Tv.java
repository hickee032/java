package sec01_exam_captionTv;

public class Tv extends Object {
	boolean power;// Ƽ���� ����
	int channel;//

	public Tv() {// �����ڴ� ��ӵ��� �ʴ� ��.
		System.out.println("���� Ŭ������ ������ ȣ��");
	}

	public Tv(boolean power, int channel) {// �����ڴ� ��ӵ��� �ʴ� ��.
		System.out.println("���� Ŭ������ �Ű������� �ִ� ������ ȣ��");
	}

	public void power() {//
		this.power = !power;
	}

	public void channelUp() {//
		++this.channel;
	}

	public void channelDown() {//
		--this.channel;
	}

}
