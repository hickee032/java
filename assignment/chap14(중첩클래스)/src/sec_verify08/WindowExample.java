package sec_verify08;

public class WindowExample {

	public static void main(String[] args) {

		Window window = new Window();

		/*
		 * Button클래스의 touch메서드를 호출하면 익명 구현 객체 에서 
		 * 오버라이딩한 메서드가 각각 호출되어 다른 결과 값을 보인다.
		 */
		
		window.btn1.touch();
		window.btn2.touch();

	}

}
