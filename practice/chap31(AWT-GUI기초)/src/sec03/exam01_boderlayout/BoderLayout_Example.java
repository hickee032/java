package sec03.exam01_boderlayout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BoderLayout_Example {

	public static void main(String[] args) {
		Frame f = new Frame("BorderLayoutTest");
		f.setSize(300, 300);

		// Frame의 기본 레이아웃은 BoderLayout이다.
		f.setLayout(new BorderLayout(10,0));

		Button north = new Button("북");
		Button east = new Button("동");
		Button south = new Button("남");
		Button west = new Button("서");
		Button center = new Button("중앙");

		f.add(BorderLayout.NORTH, north);
		f.add(BorderLayout.EAST, east);
		f.add(BorderLayout.SOUTH, south);
		f.add(BorderLayout.WEST, west);
		f.add(BorderLayout.CENTER, center);

		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		f.setVisible(true);

	}

}
