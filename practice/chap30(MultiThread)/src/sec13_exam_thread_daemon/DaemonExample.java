package sec13_exam_thread_daemon;

public class DaemonExample {

	public static void main(String[] args) {
		
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		//System.out.println(autoSaveThread.isDaemon());	
		autoSaveThread.setDaemon(true);
		System.out.println(autoSaveThread.isDaemon());
		autoSaveThread.start();
		
		//메인스레드가 5초 동안 정지하면 DaemonThread 인 autoSaveThread가 실행되고 메인 스레드가 종료 되면 
		//더이상 autoSaveThread가 실행 되지 않는 다.
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		System.out.println("MainThread 종료됨");
		
		
		

	}

}
