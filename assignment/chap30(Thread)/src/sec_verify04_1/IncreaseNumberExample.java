package sec_verify04_1;

public class IncreaseNumberExample {

	public static void main(String[] args) {
		Number number = new Number();
		
		IncreaseNumberThread FirstThread = new IncreaseNumberThread(number);
		FirstThread.setName("FirstThread");
		FirstThread.start();
		
		IncreaseNumberThread SecondThread = new IncreaseNumberThread(number);
		SecondThread.setName("SecondThread");
		SecondThread.start();
		
		IncreaseNumberThread ThirdThread = new IncreaseNumberThread(number);
		ThirdThread.setName("ThirdThread");
		ThirdThread.start();
	}

}
