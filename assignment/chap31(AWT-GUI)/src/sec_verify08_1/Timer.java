package sec_verify08_1;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@SuppressWarnings("serial")
public class Timer extends Frame implements Runnable {

	String str = null;

	public Timer() {
		this.setSize(300, 100);
		this.setVisible(true);
		this.run();

	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
				Date d = new Date();
				DateFormat time = new SimpleDateFormat("hh:mm:ss a");
				str = time.format(d);
				this.setTitle(str);
				
				System.out.println(str);
				
				this.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						System.exit(0);
					}
				});
				
			} catch (InterruptedException e) {
			}

		}

	}

}
