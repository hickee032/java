package sec01.exam01_frame;

import java.awt.Frame;

public class frameExample01 {

	public static void main(String[] args) {

		//Frame��ü�� ���� - �����̳� ��ü
		Frame frame = new Frame("Login");
		//Frame�� ũ�⸦ �����Ѵ�. Component�� ���ǵ� �޼���
		frame.setSize(300, 500);
		
		frame.setLocation(500, 200);
		//������ Frame�� ȭ�鿡 ���̵����Ѵ�. Component�� ���ǵ� �޼���
		frame.setVisible(true);
		
		//������ �������� �ݱ� ���ؼ��� Xǥ�� ������ �ݱ⸦ �ؾ��ϴµ� ������ �̺�Ʈ ó���� ���� �ʾұ� ������ �ܼ�â�� 
		//terminate��ư�� ������ �ݴ´�.

	}

}
