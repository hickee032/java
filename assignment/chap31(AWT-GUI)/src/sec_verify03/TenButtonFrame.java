package sec_verify03;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class TenButtonFrame extends Frame {

	public TenButtonFrame() {
		setTitle("TenButtonFrame");
		setSize(400, 200);
		setLayout(new GridLayout());

		setVisible(true);

		Button[] a = new Button[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Button(Integer.toString(i));
			this.add(a[i]);
		}
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

}
