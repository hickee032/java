package sec01.exam02_Button;

import java.awt.Button;
import java.awt.Frame;

public class ButtonExample02 {

	public static void main(String[] args) {

		Frame frame = new Frame("Login");
		frame.setSize(300, 200);
		frame.setLayout(null);

		Button btn1 = new Button("확인");
		Button btn2 = new Button("취소");

		btn1.setSize(100, 50);
		btn1.setLocation(40, 75);

		btn2.setSize(100, 50);
		btn2.setLocation(160, 75);
		
		frame.add(btn1);
		frame.add(btn2);
		frame.setVisible(true);
		frame.setResizable(false);

	}

}
