package sec03_exam_single_inheritance;

public class Vcr {

	boolean power;
	int counter = 0;
	
	public Vcr() {
		super();//object ȣ��
		System.out.println("Vcr ������ ȣ��");
	}
	public void power() {
		power = !power;
		System.out.println("Vcr�� power�޼��� ȣ��");
	}
	public void play() {
		System.out.println("Vcr�� play�޼��� ȣ��");
		
	}
	public void stop() {
		System.out.println("Vcr�� stop�޼��� ȣ��");
		
	}
	//�ǰ��� <<
	public void rew() {
		System.out.println("Vcr�� rew�޼��� ȣ��");
		
	}
	//�������� >>
	public void ff() {
		System.out.println("Vcr�� ff�޼��� ȣ��");
		
	}
}
