package sec_verify08;

public class DaemonThreadExample {

	public static void main(String[] args) {
		
		DateTimeThread dateTimeThread = new DateTimeThread();
		dateTimeThread.setDaemon(true);
		dateTimeThread.start();
		
		try {
			Thread.sleep(5000);
			System.out.println("���� �������� dateTimeThread�� ����˴ϴ�.");
		} catch (Exception e) {}
		System.out.println("MainThread �����");
		

	}

}
