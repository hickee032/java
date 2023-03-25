package sec03_exam_single_inheritance;

public class Vcr {

	boolean power;
	int counter = 0;
	
	public Vcr() {
		super();//object 호출
		System.out.println("Vcr 생성자 호출");
	}
	public void power() {
		power = !power;
		System.out.println("Vcr의 power메서드 호출");
	}
	public void play() {
		System.out.println("Vcr의 play메서드 호출");
		
	}
	public void stop() {
		System.out.println("Vcr의 stop메서드 호출");
		
	}
	//되감기 <<
	public void rew() {
		System.out.println("Vcr의 rew메서드 호출");
		
	}
	//빨리감기 >>
	public void ff() {
		System.out.println("Vcr의 ff메서드 호출");
		
	}
}
