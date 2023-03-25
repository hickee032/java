package sec04.exam04_Textfield_textarea_event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class TextComponentEvent extends Frame {

	TextField textField;
	TextArea textArea;
	Button button;

	public TextComponentEvent(String name) {
		super(name);

	}

	public void textShow() {
		this.setLayout(null);
		this.textField = new TextField();
		this.textArea = new TextArea();
		this.textArea = new TextArea("", 10, 30, TextArea.SCROLLBARS_NONE);
		this.button = new Button("����");

		this.add(textField);
		this.textField.setBounds(10, 130, 200, 30);
		this.add(textArea);
		this.textArea.setBounds(10, 30, 300, 100);
		this.add(button);
		this.button.setBounds(210, 130, 80, 30);

//		1.Button�� ����������
//		2.menu�� Ŭ��������
//		3.textField���� enter�� ��������
//		4.list���� item�� ����Ŭ�� ������
//		---------->ActionEvent�߻��Ǵ� 4���� �̴�.

		this.textField.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("actionPerformed() ����");
				textArea.append(textField.getText() + "\n");
				textField.setText("");
				textField.requestFocus();
			}
		});

		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("actionPerformed() ����");
				textArea.append(textField.getText() + "\n");
				textField.setText("");
				textField.requestFocus();

			}
		});

		// textArea�� ������ ���� ���ϰ��Ѵ�.
		this.textArea.setEditable(false);
		this.setBounds(500, 300, 300, 200);
		this.setVisible(true);

		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

}
