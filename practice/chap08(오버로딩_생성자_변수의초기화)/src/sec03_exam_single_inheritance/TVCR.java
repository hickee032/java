package sec03_exam_single_inheritance;

public class TVCR extends Tv {
	
	Vcr vcr = new Vcr();
	
	int channel = 20;
	int counter = vcr.counter;
	
	public TVCR() {
	super();//tv()ȣ��
	System.out.println("TVCR������ ȣ��");
	}

	//this�� ��ü �ڽ��� ����Ų��. super�� ���� Ŭ������ ����Ų��.
	
	public int getChannel() {
		return this.channel;
	}
	
	public void play() {
		vcr.play();
	}
	public void stop() {
		vcr.stop();
	}
	public void rew() {
		vcr.rew();
	}
	public void ff() {
		vcr.ff();
	}
	
	//���� �޼��带 ������ (�������̵�), ����� �׻� ���ƾ� �Ѵ�. (�ſ� �߿�)
	//��Ӱ��迡�� �������̵��� �̷������ �Ѵ�.
	
	@Override
	public void power() {
	 this.power = !power;
	 System.out.println("�ڼ� Ŭ������ TVCR power�޼��� ȣ��");
	 super.power(); //Tv�� power()ȣ��
	}
}
