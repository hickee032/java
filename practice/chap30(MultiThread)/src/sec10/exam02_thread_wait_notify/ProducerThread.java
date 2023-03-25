package sec10.exam02_thread_wait_notify;

public class ProducerThread extends Thread {
	
	private DataBox dataBox;
	
	public ProducerThread(DataBox dataBox) {
		this.setName("ProducerThread"); //스레드 이름 지정
		this.dataBox = dataBox;
	}
	
	@Override
	public void run() {
	for (int i = 1; i <=3; i++) {
		String data = "Data"+i;  //데이터 생산
		dataBox.setData(data); //공유객체에 데이터 지정
	}
	}

}
