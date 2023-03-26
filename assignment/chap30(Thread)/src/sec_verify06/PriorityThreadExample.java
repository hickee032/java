package sec_verify06;

public class PriorityThreadExample {

	public static void main(String[] args) {
		
		PriorityThread ThreadA = new PriorityThread("Power");
		PriorityThread ThreadB = new PriorityThread("Water");
		PriorityThread ThreadC = new PriorityThread("Fire");
		ThreadA.setPriority(1);
		ThreadB.setPriority(5);
		ThreadC.setPriority(10);
		
		ThreadA.start();
		ThreadB.start();
		ThreadC.start();
		

	}

}
