package sec04_exam_Nested_Interface;

//Butten클래스의 내부 인터페이스인 OnclickListerne의 추상메서드를 재정의 한다.
public class MessageListener implements Button.OnclickListerner{

	@Override
	public void onClick() {
		System.out.println("메세지를 보냅니다.");
		
	}
	
	
	
	

}
