package sec01.exam02_Button;

import java.awt.Button;
import java.awt.Frame;

public class ButtonExample01 {

	public static void main(String[] args) {
		
		//프레임 독립적 컨테이너
		//컨테이너는 컴포넌트를 담을 수있다.
		//프레임의 기본적 레이아웃매니저는 BorderLayout이다.
		Frame frame = new Frame("Login");
		frame.setSize(500, 500);
		frame.setLayout(null);
		
		//버튼생성
		Button btn1 = new Button("확인");
		Button btn2 = new Button("취소");
		
		//버튼의 크기 설정
		btn1.setSize(100, 50);
		btn2.setSize(100, 50);

		//버튼의 크기 설정
		btn1.setLocation(110, 50);
		btn2.setLocation(220, 50);
		
		
		frame.add(btn1);
		frame.add(btn2);
		frame.setVisible(true);
		
		/*
		 * 실행을 시켜보면 분명 버튼의 크기는 100,50인데 프레임을 다 차지하고있다. 
		 * 이것은 레이아웃 매니저가 기본적으로 BorderLayout으로 프레임을 설정하고 있기 때문이다. 
		 * 이것을 setLayout()를 이용해 바꿀수 있다.
		 */
	}

}
