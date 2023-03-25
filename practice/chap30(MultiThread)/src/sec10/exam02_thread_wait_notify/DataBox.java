package sec10.exam02_thread_wait_notify;

public class DataBox {

	private String data;
	
	//아래에 있는 getData()는 ConsumerThread가 data를 읽어 가도록 되어있다.
	//그래서 null이면 wait(일시정지 BLOCKED상태)가 되고 null이 아니라면 ConsumerThread가 읽은 데이터를 출력하고
	//waiting상태가 된 스레드를 notify()를 통해 싱행대기 상태로 만든다.
	
	public synchronized String getData() {
		//읽어 올 데이터가 없다면.
		if(this.data == null) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		String returnvalue = this.data;
		System.out.println("ComsumerThread가 읽은 데이터 : "+ this.data);
		this.data = null;
		notify();
		return returnvalue;
	}
	
	public synchronized void setData(String data) {
		//Comsumer 스레드가 데이터를 읽지 않았다면
		if(this.data != null) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		this.data = data; //data 필드에다가 값을 저장.
		System.out.println("ProducerThread가 생성한 데이터 : "+this.data);
		notify(); //다른 스레드를 깨운다.(ConsumerThread)
		
		//결과 적으로 wait() notify()를 번갈아 이용하면서 공유 객체에 접근하기 위해서는 synchronized 동기화 제어자가 
		//들어가야 예외도 발생하지 않으면 데이터의 정확성과 신뢰성을 보장한다.
	}
}
