package sec04_exam_Nested_Interface;

public class Button {

	// 내부 인터 페이스 선언
	interface OnclickListerner {
		void onClick();
	}

	OnclickListerner listener;

	// 인터페이스 참조변수를 대입 하기 위한 setter구현
	// 매개변수가 인터페이스 타입이 들어 왔다 라는 것은???
	// ---->
	public void setOnclickListener(OnclickListerner listerner) {
		this.listener = listerner;

	}

	// touch()를 호출 한다는 것은 내부 인터페이스를 구현한 클래스의 OnClick()가 호출 된다.
	public void touch() {
		listener.onClick();
	}

}
