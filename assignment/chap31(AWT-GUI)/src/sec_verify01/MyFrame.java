package sec_verify01;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial") // serial warning 체크 안함.
public class MyFrame extends Frame {

	public MyFrame() {
		this.setTitle("MyFrame");
		this.setSize(400, 200);
		this.setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

}
