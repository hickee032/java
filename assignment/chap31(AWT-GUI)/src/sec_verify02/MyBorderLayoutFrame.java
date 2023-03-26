package sec_verify02;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class MyBorderLayoutFrame extends Frame {

	public MyBorderLayoutFrame() {

		this.setTitle("BorderLayout Practice");

		setSize(400, 200);

		Button btn1 = new Button("1");
		Button btn2 = new Button("2");
		Button btn3 = new Button("3");
		Button btn4 = new Button("4");
		Button btn5 = new Button("5");

		setLayout(new BorderLayout(10, 10));

		add(btn1, BorderLayout.NORTH);
		add(btn2, BorderLayout.CENTER);
		add(btn3, BorderLayout.WEST);
		add(btn4, BorderLayout.EAST);
		add(btn5, BorderLayout.SOUTH);

		setVisible(true);

		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}
}
