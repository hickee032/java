package sec06_exam_annonymous_implements;

public class Annonymous {
	RemoteControl field = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("TV를 켜다");

		}

		@Override
		public void turnOff() {
			System.out.println("TV를 끄다");

		}
	};

	public void method1() {
		//로컬변수로 인터페이스 타입을 선언후 익명 구현객체 생성
		RemoteControl localvar = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("오디오를 켜다");

			}

			@Override
			public void turnOff() {
				System.out.println("오디오를 끄다");

			}
		};
		localvar.turnOn();
		localvar.turnOff();
	}
	//매개변수로 인터페이스 타입이 들어왔다 이 의미는 ??
	void method2(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
}
