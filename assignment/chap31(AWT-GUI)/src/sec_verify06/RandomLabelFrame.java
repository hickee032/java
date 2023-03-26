package sec_verify06;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class RandomLabelFrame extends Frame {

	public RandomLabelFrame() {

		this.setTitle("RandomLabel");
		this.setSize(500, 500);
		this.setLayout(null);

		Label[] r = new Label[20];

		for (int i = 0; i < r.length; i++) {

			r[i] = new Label(Integer.toString(i));

			Color a = new Color((int) (Math.random() * 255.0), (int) (Math.random() * 255.0),
					(int) (Math.random() * 255.0));
			r[i].setBackground(a);
			r[i].setSize(30, 30);
			r[i].setLocation(50 + (int) (Math.random() * 400), 50 + (int) (Math.random() * 400));
			this.add(r[i]);
		}
			
		Color x = new Color((int) (Math.random() * 255.0), (int) (Math.random() * 255.0),
				(int) (Math.random() * 255.0));
		this.setBackground(x);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		this.setVisible(true);

	}

}
