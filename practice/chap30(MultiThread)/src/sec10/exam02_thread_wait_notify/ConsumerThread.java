package sec10.exam02_thread_wait_notify;

public class ConsumerThread extends Thread {
	
	private DataBox dataBox;
	
	public ConsumerThread(DataBox dataBox) {
		this.setName("ConsumerThread");
		this.dataBox = dataBox;
	}
	
	@Override
	public void run() {
	for (int i = 1; i <=3; i++) {
		String data = this.dataBox.getData();
	}
	}

}
