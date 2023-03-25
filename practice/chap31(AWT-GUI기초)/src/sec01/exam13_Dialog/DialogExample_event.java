package sec01.exam13_Dialog;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DialogExample_event {

	public static void main(String[] args) {
		Frame f = new Frame("Parent");
		f.setSize(500, 500);

		Dialog info = new Dialog(f, "info", true);
		info.setSize(150, 100);
		info.setLocation(550, 50);
		info.setLayout(new FlowLayout());

		Label msg = new Label("�� ���� ���", Label.CENTER);

		Button ok = new Button("OK");
		/*
		 * OK��ư�� ActionListener�� �߰� �����ʴ� �����ϴ� ���� �Ͽ� 
		 * �Ű������� ���� ���̽��� ActionListener�� ������ �ְ� �װ��� �͸� ���� 
		 * ���� OK��ư�� ������ Diglog�� ��������̴�.
		 */

		ok.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				info.setVisible(false);
				info.dispose();

			}
		});

		/*
		 * ������ �̺�Ʈ ó�� �κ� �Ű������� WindowAdapter Ŭ����
		 * WindowAdapter Ŭ������ WindowListener �������̽��� �ִ� 
		 * 7���� �߻� Ŭ������ ������ ���Ҵ�.({}�θ� �ص� ->�� ������ ����)
		 */
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {

				System.exit(0);
			}
		});

		info.add(msg);
		info.add(ok);
		f.add(info);

	}

}
