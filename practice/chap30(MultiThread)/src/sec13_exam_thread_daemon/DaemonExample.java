package sec13_exam_thread_daemon;

public class DaemonExample {

	public static void main(String[] args) {
		
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		//System.out.println(autoSaveThread.isDaemon());	
		autoSaveThread.setDaemon(true);
		System.out.println(autoSaveThread.isDaemon());
		autoSaveThread.start();
		
		//���ν����尡 5�� ���� �����ϸ� DaemonThread �� autoSaveThread�� ����ǰ� ���� �����尡 ���� �Ǹ� 
		//���̻� autoSaveThread�� ���� ���� �ʴ� ��.
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		System.out.println("MainThread �����");
		
		
		

	}

}
