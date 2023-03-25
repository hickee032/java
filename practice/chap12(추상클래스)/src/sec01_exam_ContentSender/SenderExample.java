package sec01_exam_ContentSender;

public class SenderExample {

	public static void main(String[] args) {
		//추상클래스는 인스턴스를 절대생성하지 못한다.
		//ContentSender cs = new ContentSender();
		
		/*
		 * 추상 메서드 sendMsg()가 포함되어 있기 때문에 인스턴스를 생성할수 없다. 
		 * 추상 클래스는 추상 메서드가 1개이상 포함되어 있는  클래스를 추상클래스라 부른다.
		 * 
		 * 추상클래스는 공통된 부분들을 모아서 메서드를 만든다.
		 * 추상 클래스의 일부 메서드만 구현시 abstract를 붙여줘야한다.
		 * 
		 * 추상 클래스는 추상 메서드가 모두 오버라이딩 되어서 구현부가 완성되어야지만 인스턴스를 생성할수 있게된다. 
		 * 일반 메서드가 추상 메서드를 호출할수있다. 
		 * 메서드의 호출에는 선언부만 필요하기 때문이다. -----그래서 선언부가 99% 중요하다.
		 * 
		 */
		
		//추상클래스도 조상이기 때문에 다형성이 적용
		//단 조상클래스에 선언된 추상 메서드를 다 구현한 자손클래스에만 대입 가능
		
		ContentSender cs1 = new letterSender("Sms","김우진","4달라");
		cs1.sendMsg("신은혁");
		System.out.println();
		
		letterSender ls = new letterSender("SMS", "사공수기", "반가워 현지");
		KakaoSender ks = new KakaoSender("SMS", "이재훈", "카카오톡");
		
		//조상클래스의 오버라이딩한 메서드 호출. 각기 다른 결과.
		ls.sendMsg("그녀1");
		System.out.println();
		ks.sendMsg("현지");
			


	}

}
