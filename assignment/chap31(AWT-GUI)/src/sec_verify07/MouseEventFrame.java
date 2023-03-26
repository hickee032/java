package sec_verify07;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class MouseEventFrame extends Frame {

	public MouseEventFrame() {
		this.setSize(100, 100);
		this.setLayout(new FlowLayout());

		Label lb = new Label();
		lb.setAlignment(Label.CENTER);

		this.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				lb.setSize(100, 100);
				lb.setText("들어와써");
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lb.setSize(100, 100);
				lb.setText("나가써");
			}

		});

		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		this.add(lb);
		this.setVisible(true);
	}

}
