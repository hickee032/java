package sec04_exam_Nested_Interface;

public class ButtenExample {

	public static void main(String[] args) {
		
		Button btn = new Button();
		
		//아래 코드는 인터페이스의 매개변수의 다형성에 의해서 각기 다른 출력 결과를 보이고 있다.
		btn.setOnclickListener(new CallListener());
		btn.touch();
		
		btn.setOnclickListener(new MessageListener());
		btn.touch();
		
		

	}

}
