package sec04.exam01_Mouse_Event;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class MouseEventClass extends Frame {

	private Label location;

	public MouseEventClass(String title) {
		super(title);
		this.setLocation(500, 300);
		this.setLayout(null);
		
	}

	public void MouseShow() {
		// Label¿¡ ´ëÇÑ ¼³Á¤
		this.location = new Label("");
		this.location.setBounds(50, 50, 200, 20);
		this.location.setBackground(Color.YELLOW);
		this.add(location);

		this.addMouseListener(new EventHandler());
		this.addMouseMotionListener(new EventHandler());

		this.setSize(300, 200);
		this.setVisible(true);

		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	class EventHandler extends MouseAdapter {
		
		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getModifiers() == MouseEvent.BUTTON3_MASK) {
				System.out.println(Thread.currentThread().getName());
				System.out.println("Mouse ÁÂÇ¥ " + e.getX() + " , " + e.getY());
			}
		}

		@Override
		public void mouseMoved(MouseEvent e) {

			System.out.println(Thread.currentThread().getName());

			location.setText("Mouse ÁÂÇ¥ : " + e.getX() + " , " + e.getY());
		}
	}

}
