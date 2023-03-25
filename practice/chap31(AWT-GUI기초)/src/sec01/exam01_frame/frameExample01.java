package sec01.exam01_frame;

import java.awt.Frame;

public class frameExample01 {

	public static void main(String[] args) {

		//Frame객체를 생성 - 컨테이너 객체
		Frame frame = new Frame("Login");
		//Frame의 크기를 설정한다. Component에 정의된 메서드
		frame.setSize(300, 500);
		
		frame.setLocation(500, 200);
		//생성한 Frame을 화면에 보이도록한다. Component에 정의된 메서드
		frame.setVisible(true);
		
		//생성된 프레임을 닫기 위해서는 X표를 눌러서 닫기를 해야하는데 지금은 이벤트 처리를 하지 않았기 때문에 콘솔창의 
		//terminate버튼을 눌러서 닫는다.

	}

}
