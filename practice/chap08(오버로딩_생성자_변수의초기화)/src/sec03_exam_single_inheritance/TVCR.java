package sec03_exam_single_inheritance;

public class TVCR extends Tv {
	
	Vcr vcr = new Vcr();
	
	int channel = 20;
	int counter = vcr.counter;
	
	public TVCR() {
	super();//tv()호출
	System.out.println("TVCR생성자 호출");
	}

	//this는 객체 자신을 가리킨다. super는 조상 클래스를 가리킨다.
	
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
	
	//조상 메서드를 재정의 (오버라이딩), 선언부 항상 같아야 한다. (매우 중요)
	//상속관계에서 오버라이딘이 이루어져야 한다.
	
	@Override
	public void power() {
	 this.power = !power;
	 System.out.println("자손 클래스의 TVCR power메서드 호출");
	 super.power(); //Tv의 power()호출
	}
}
