package sec_verify08;

public class Window {

	// 필드
	Button btn1 = new Button();
	Button btn2 = new Button();

	// 필드(멤버 변수)의 초기값
	Button.OnClickListener listener = new Button.OnClickListener() {

		@Override
		public void OnClick() {
			System.out.println("전화를 겁니다.");

		}
	};

	public Window() {
		btn1.setOnClickListener(listener);
		btn2.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void OnClick() {

				System.out.println("메세지를 보냅니다.");
			}
		});
	}
}
