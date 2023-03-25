package sec01.exam07_TextField;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class TextFieldExample {

	public static void main(String[] args) {

		Frame f = new Frame("Login");
		f.setSize(400, 80);
		// LayoutManager�� FlowLayout���� �Ѵ�.
		f.setLayout(new FlowLayout());

		Label lid = new Label("���̵� :", Label.RIGHT); // ������ ����������.
		Label lpwd = new Label("�н����� :", Label.RIGHT);

		// �� 10���� ���ڸ� �Է��� �� �ִ� TextField ����
		TextField id = new TextField(10);
		TextField pwd = new TextField(10);
		// �Է��� �� ��� '*'�� ���̵��� �Ѵ�.(���ڹ��� ����) ��й�ȣ ������ ���
		pwd.setEchoChar('*');
		// pwd.setEchoChar('-');
		char ch = pwd.getEchoChar();
		System.out.println("������ ���ڹ��� : " + ch);

		// ������ ������Ʈ���� Frame�� ���Խ�Ų��.
		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.setVisible(true);

	}

}
