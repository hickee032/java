package sec10.exam02_thread_wait_notify;

public class DataBox {

	private String data;
	
	//�Ʒ��� �ִ� getData()�� ConsumerThread�� data�� �о� ������ �Ǿ��ִ�.
	//�׷��� null�̸� wait(�Ͻ����� BLOCKED����)�� �ǰ� null�� �ƴ϶�� ConsumerThread�� ���� �����͸� ����ϰ�
	//waiting���°� �� �����带 notify()�� ���� ������ ���·� �����.
	
	public synchronized String getData() {
		//�о� �� �����Ͱ� ���ٸ�.
		if(this.data == null) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		String returnvalue = this.data;
		System.out.println("ComsumerThread�� ���� ������ : "+ this.data);
		this.data = null;
		notify();
		return returnvalue;
	}
	
	public synchronized void setData(String data) {
		//Comsumer �����尡 �����͸� ���� �ʾҴٸ�
		if(this.data != null) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		this.data = data; //data �ʵ忡�ٰ� ���� ����.
		System.out.println("ProducerThread�� ������ ������ : "+this.data);
		notify(); //�ٸ� �����带 �����.(ConsumerThread)
		
		//��� ������ wait() notify()�� ������ �̿��ϸ鼭 ���� ��ü�� �����ϱ� ���ؼ��� synchronized ����ȭ �����ڰ� 
		//���� ���ܵ� �߻����� ������ �������� ��Ȯ���� �ŷڼ��� �����Ѵ�.
	}
}
