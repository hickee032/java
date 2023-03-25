package sec01.exam01_frame;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class frameExample02 {

	public static void main(String[] args) {
		Frame frame = new Frame("Login");
		frame.setSize(300, 200);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		
		//화면의 크기를 구하는 방법
		Dimension screensize = tk.getScreenSize();
		System.out.println(screensize.toString());
		
		//화면 크기의 절반값에서 Frame크기의 절반 값을 뺸 위치로 하면 Frame이 화면 가운데 위치
		//150,100을 빼는 이유는 프레임 사이즈의 절반을 뺀것
		frame.setLocation((screensize.width/2)-150, (screensize.height/2)-100);
		frame.setVisible(true);
	}

}
