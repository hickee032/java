package sec01.exam02_Button;

import java.awt.Button;
import java.awt.Frame;

public class ButtonExample01 {

	public static void main(String[] args) {
		
		//������ ������ �����̳�
		//�����̳ʴ� ������Ʈ�� ���� ���ִ�.
		//�������� �⺻�� ���̾ƿ��Ŵ����� BorderLayout�̴�.
		Frame frame = new Frame("Login");
		frame.setSize(500, 500);
		frame.setLayout(null);
		
		//��ư����
		Button btn1 = new Button("Ȯ��");
		Button btn2 = new Button("���");
		
		//��ư�� ũ�� ����
		btn1.setSize(100, 50);
		btn2.setSize(100, 50);

		//��ư�� ũ�� ����
		btn1.setLocation(110, 50);
		btn2.setLocation(220, 50);
		
		
		frame.add(btn1);
		frame.add(btn2);
		frame.setVisible(true);
		
		/*
		 * ������ ���Ѻ��� �и� ��ư�� ũ��� 100,50�ε� �������� �� �����ϰ��ִ�. 
		 * �̰��� ���̾ƿ� �Ŵ����� �⺻������ BorderLayout���� �������� �����ϰ� �ֱ� �����̴�. 
		 * �̰��� setLayout()�� �̿��� �ٲܼ� �ִ�.
		 */
	}

}
