package sec_verify05;


import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;

@SuppressWarnings("serial")
public class Plate4x4Frame extends Frame {

	public Plate4x4Frame() {

		this.setTitle("Plate4x4Frame");
		this.setSize(400, 300);
		this.setLayout(new GridLayout(4, 4));

		Color[] c = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA,
				Color.GRAY, Color.PINK, Color.LIGHT_GRAY, Color.WHITE, Color.DARK_GRAY, Color.BLACK, Color.ORANGE,
				Color.BLUE, Color.MAGENTA };

		Label[] a = new Label[16];

		for (int i = 0; i < a.length; i++) {
			a[i] = new Label(Integer.toString(i));
			a[i].setBackground(c[i]);
			this.add(a[i]);

		}

		this.setVisible(true);

	}

}
