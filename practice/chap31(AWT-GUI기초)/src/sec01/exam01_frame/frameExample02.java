package sec01.exam01_frame;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class frameExample02 {

	public static void main(String[] args) {
		Frame frame = new Frame("Login");
		frame.setSize(300, 200);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		
		//ȭ���� ũ�⸦ ���ϴ� ���
		Dimension screensize = tk.getScreenSize();
		System.out.println(screensize.toString());
		
		//ȭ�� ũ���� ���ݰ����� Frameũ���� ���� ���� �A ��ġ�� �ϸ� Frame�� ȭ�� ��� ��ġ
		//150,100�� ���� ������ ������ �������� ������ ����
		frame.setLocation((screensize.width/2)-150, (screensize.height/2)-100);
		frame.setVisible(true);
	}

}
