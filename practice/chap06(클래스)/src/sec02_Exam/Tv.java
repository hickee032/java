package sec02_Exam;

public class Tv {

	// tv의 속성(attribute) 멤버변수 필드
	String color; // tv 색상
	boolean power; // tv 전원
	int channel; // tv의 채널

	public Tv() {
		System.out.println("기본 생성자 호출");
	}

	// tv의 전원을 끄고 켜는 기능
	// 멤버 메서드
	void power() {
		this.power = !power;
		return; // 메서드는 리턴문을 만나면 즉시 종료
	}

	// tv의 채널을 높이는 기능
	void channelUp() {

		if (this.channel < 0) {
			System.out.println("더이상 채널이 없습니다.");
		}

		if (this.channel > 999) {
			System.out.println("더이상 채널이 없습니다.");
			this.channel = 0;
		}

		this.channel++;
		return;
	}

	void channelDown() {

		if (this.channel < 0) {
			System.out.println("더이상 채널이 없습니다.");
		}

		if (this.channel > 999) {
			System.out.println("더이상 채널이 없습니다.");
			this.channel = 2;
		}
		this.channel--;
		return;
	}
}
