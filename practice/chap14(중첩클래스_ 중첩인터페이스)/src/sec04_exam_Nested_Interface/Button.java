package sec04_exam_Nested_Interface;

public class Button {

	// ���� ���� ���̽� ����
	interface OnclickListerner {
		void onClick();
	}

	OnclickListerner listener;

	// �������̽� ���������� ���� �ϱ� ���� setter����
	// �Ű������� �������̽� Ÿ���� ��� �Դ� ��� ����???
	// ---->
	public void setOnclickListener(OnclickListerner listerner) {
		this.listener = listerner;

	}

	// touch()�� ȣ�� �Ѵٴ� ���� ���� �������̽��� ������ Ŭ������ OnClick()�� ȣ�� �ȴ�.
	public void touch() {
		listener.onClick();
	}

}
