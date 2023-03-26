package sec_verify04;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;

@SuppressWarnings("serial")
public class TenButtonFrame extends Frame {

	public TenButtonFrame() {

		setTitle("TenButtonFrame");
		setSize(400, 300);
		setLayout(new GridLayout());

		Color[] b = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA,
				Color.GRAY, Color.PINK, Color.LIGHT_GRAY };

		Button[] a = new Button[10];

		for (int i = 0; i < a.length; i++) {
			a[i] = new Button(Integer.toString(i));
			a[i].setBackground(b[i]);
			this.add(a[i]);
		}

		this.setVisible(true);

	}

}
