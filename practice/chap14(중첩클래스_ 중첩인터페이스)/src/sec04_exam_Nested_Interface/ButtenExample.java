package sec04_exam_Nested_Interface;

public class ButtenExample {

	public static void main(String[] args) {
		
		Button btn = new Button();
		
		//�Ʒ� �ڵ�� �������̽��� �Ű������� �������� ���ؼ� ���� �ٸ� ��� ����� ���̰� �ִ�.
		btn.setOnclickListener(new CallListener());
		btn.touch();
		
		btn.setOnclickListener(new MessageListener());
		btn.touch();
		
		

	}

}
