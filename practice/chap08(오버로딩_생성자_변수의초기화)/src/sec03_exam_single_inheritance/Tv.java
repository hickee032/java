package sec03_exam_single_inheritance;

public class Tv {
	
	boolean power;
	int channel = 10;
	
	public  Tv() {
		super();//object������ ȣ��
		System.out.println("Tv����Ŭ���� ������ ȣ��");
		
	}
	
	public void power() {
		this.power = !this.power;
		System.out.println("���� Ŭ���� Tv�� power�޼��� ȣ��");
	}
	
	public void channelUp() {
		++this.channel;
		System.out.println("���� Ŭ���� Tv�� channerUp�޼��� ȣ��");
		
	}
	
	public void channelDown() {
		--this.channel;
		System.out.println("���� Ŭ���� Tv�� channerDown�޼��� ȣ��");
		
	}

}
