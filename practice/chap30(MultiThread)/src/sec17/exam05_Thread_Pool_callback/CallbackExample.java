package sec17.exam05_Thread_Pool_callback;

public class CallbackExample {

	public static void main(String[] args) {
		
		Callback callback = new Callback();
		
		/*
		 * Callback()란 메인 메서드와 별개로 움직이며 메인스레드가 움직이는 데 블로킹이 일어나지 않으며 자동으로 실행되어 작업객체가 작업
		 * 처리를 완료하게 되면 자동으로 불러 지는 메서드를 콜백메서드라고 한다.
		 */
		
		callback.doWork("10", "100"); //compelete() 자동호출됨
		callback.doWork("10", "100"); //compelete() 자동호출됨
		callback.doWork("10", "백");   //failed() 자동호출됨
		callback.doWork("10", "100"); //compelete() 자동호출됨
		callback.doWork("10", "100"); //compelete() 자동호출됨
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		
		callback.finish();
	}

}
