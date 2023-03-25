package sec04.exam01_TextField_Event;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class TextFieldClass extends Frame {

	Label lid;
	Label lpwd;
	TextField tfID;
	TextField tfPwd;
	Button ok;

	public TextFieldClass(String title) {
		super(title);
	}

	public void TextFieldshow() {
		this.lid = new Label("ID : ", Label.RIGHT);
		this.lpwd = new Label("PassWord : ", Label.RIGHT);

		// 10���� ���ڸ� �Է��Ҽ��ִ� TextField ����
		this.tfID = new TextField(10);
		this.tfPwd = new TextField(10);
		this.tfPwd.setEchoChar('*'); // �Է°���� *�� ��Ÿ��
		this.ok = new Button("OK");

		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		this.tfID.addActionListener(new EventHandler());
		this.tfPwd.addActionListener(new EventHandler());
		this.ok.addActionListener(new EventHandler());

		this.setLayout(new FlowLayout());
		this.add(lid);
		this.add(tfID);
		
		this.add(lpwd);
		this.add(tfPwd);
		
		this.add(ok);

		this.setSize(450, 80);
		this.setLocation(500, 300);
		this.setVisible(true);
	}

	class EventHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String id = tfID.getText().trim();
			String password = tfPwd.getText().trim();

			if (!id.equals("abcde")) {
				System.out.println("�Է��Ͻ� ���̵� ��ȿ���� �ʽ��ϴ�.");
				// �ٽ� �Է�â���� ���ư���.
				tfID.requestFocus();
				tfID.selectAll();
			} else if (!password.equals("12345")) {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				tfPwd.requestFocus();
				tfPwd.selectAll();
			} else {
				System.out.println(id + " �α���");
			}
		}
	}

}
