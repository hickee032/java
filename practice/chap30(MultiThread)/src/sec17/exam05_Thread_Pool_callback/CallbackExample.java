package sec17.exam05_Thread_Pool_callback;

public class CallbackExample {

	public static void main(String[] args) {
		
		Callback callback = new Callback();
		
		/*
		 * Callback()�� ���� �޼���� ������ �����̸� ���ν����尡 �����̴� �� ���ŷ�� �Ͼ�� ������ �ڵ����� ����Ǿ� �۾���ü�� �۾�
		 * ó���� �Ϸ��ϰ� �Ǹ� �ڵ����� �ҷ� ���� �޼��带 �ݹ�޼����� �Ѵ�.
		 */
		
		callback.doWork("10", "100"); //compelete() �ڵ�ȣ���
		callback.doWork("10", "100"); //compelete() �ڵ�ȣ���
		callback.doWork("10", "��");   //failed() �ڵ�ȣ���
		callback.doWork("10", "100"); //compelete() �ڵ�ȣ���
		callback.doWork("10", "100"); //compelete() �ڵ�ȣ���
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		
		callback.finish();
	}

}
