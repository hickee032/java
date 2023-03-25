package sec03.exam02_FlowLayout;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FlowLayout_Example {

	public static void main(String[] args) {
		Frame f = new Frame("BorderLayoutTest");
		f.setSize(300, 300);

		// 왼쪽 정렬을 하고 수평 수직 갭을 10으로 설정
		f.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
		f.add(new Button("-- 1 --"));
		f.add(new Button("-- 2 --"));
		f.add(new Button("-- 3 --"));
		f.add(new Button("-- 4 --"));
		f.add(new Button("-- 5 --"));

		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		f.setVisible(true);

	}

}
