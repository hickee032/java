package sec_verify08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeThread extends Thread {

	@Override
	public void run() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");

		Date t = new Date();

		try {
			for (int i = 0; i <= 5; i++) {
				Thread.sleep(1000);
				System.out.println("오늘 날짜 및 시간 : " + format.format(t));
			}
		} catch (InterruptedException e) {}
		

	}

}
