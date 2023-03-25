package sec01.exam17_frame_windowevent;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameWindowExample {

	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setSize(300, 200);
		frame.setLocation(500, 300);
		//frame.addWindowListener(new EventHandler());
		
		frame.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("Adapter class ÀÌ¿כ");
				System.exit(0);
			}
		});
		frame.setVisible(true);

	}

}
