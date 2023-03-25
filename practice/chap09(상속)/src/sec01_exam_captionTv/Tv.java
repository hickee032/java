package sec01_exam_captionTv;

public class Tv extends Object {
	boolean power;// 티비의 전원
	int channel;//

	public Tv() {// 생성자는 상속되지 않는 다.
		System.out.println("조상 클래스의 생성자 호출");
	}

	public Tv(boolean power, int channel) {// 생성자는 상속되지 않는 다.
		System.out.println("조상 클래스의 매개변수가 있는 생성자 호출");
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
