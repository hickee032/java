package sec_verify07;

public class InterruptExample {

	public static void main(String[] args) {
		DrawThread dt = new DrawThread();
		
		
		try {
			dt.start();
			Thread.sleep(2000);
		} catch (InterruptedException e) {}

		dt.interrupt();
		

	}

}
