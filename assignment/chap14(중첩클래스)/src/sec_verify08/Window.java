package sec_verify08;

public class Window {

	// �ʵ�
	Button btn1 = new Button();
	Button btn2 = new Button();

	// �ʵ�(��� ����)�� �ʱⰪ
	Button.OnClickListener listener = new Button.OnClickListener() {

		@Override
		public void OnClick() {
			System.out.println("��ȭ�� �̴ϴ�.");

		}
	};

	public Window() {
		btn1.setOnClickListener(listener);
		btn2.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void OnClick() {

				System.out.println("�޼����� �����ϴ�.");
			}
		});
	}
}
