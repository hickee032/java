package sec_verify08;

public class DaemonThreadExample {

	public static void main(String[] args) {
		
		DateTimeThread dateTimeThread = new DateTimeThread();
		dateTimeThread.setDaemon(true);
		dateTimeThread.start();
		
		try {
			Thread.sleep(5000);
			System.out.println("데몬 스레드인 dateTimeThread가 종료됩니다.");
		} catch (Exception e) {}
		System.out.println("MainThread 종료됨");
		

	}

}
