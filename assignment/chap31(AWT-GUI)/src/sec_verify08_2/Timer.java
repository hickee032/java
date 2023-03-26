package sec_verify08_2;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@SuppressWarnings("serial")
public class Timer extends Frame {

	public Timer() {
		this.setTitle("½ºÄÉÁì");
		this.setSize(500, 70);
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());

		DateFormat time = new SimpleDateFormat("yyyy³â MM¿ù");

		Button bt1 = new Button("¢¸");
		Button bt2 = new Button("¢º");
		Label mtime = new Label();
		mtime.setText(time.format(cal.getTime()));

		Panel b1 = new Panel();
		b1.setBackground(Color.YELLOW);
		b1.add(bt1);
		Panel month = new Panel();
		month.setBackground(Color.YELLOW);
		Panel b2 = new Panel();
		b2.setBackground(Color.YELLOW);
		b2.add(bt2);

		this.add(b1, BorderLayout.WEST);
		this.add(month, BorderLayout.CENTER);
		this.add(b2, BorderLayout.EAST);

		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		});

		ActionListener event = new ActionListener() {

			@SuppressWarnings("static-access")
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == bt1) {
					cal.add(cal.MONTH, -1);
					mtime.setText(time.format(cal.getTime()));
					// month.add(new Label(time.format(cal.getTime())));
					System.out.println(time.format(cal.getTime()));
				} else if (e.getSource() == bt2) {
					cal.add(cal.MONTH, 1);
					mtime.setText(time.format(cal.getTime()));
					// month.add(new Label(time.format(cal.getTime())));
					System.out.println(time.format(cal.getTime()));
				}
			};

		};

		month.add(mtime);

		bt1.addActionListener(event);
		bt2.addActionListener(event);

		this.setVisible(true);

	}

}