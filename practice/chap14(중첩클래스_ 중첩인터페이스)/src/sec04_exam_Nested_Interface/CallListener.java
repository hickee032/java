package sec04_exam_Nested_Interface;

//Butten클래스의 내부 인터페이스인 OnclickListerne의 추상메서드를 재정의 한다.
public class CallListener implements Button.OnclickListerner{

	@Override
	public void onClick() {
		System.out.println("전화를 합니다.");
		
	}
	
	
	
	

}
