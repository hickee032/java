package sec_verify04_2;

public class Account {

	private int balance = 0;

	public synchronized void setBalance() {

		try {
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+"이/가 입금 : " +balance);
		} catch (InterruptedException e) {
		}
	}

	public synchronized int getBalance() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}

		return balance;
	}

	public synchronized void withDraw() {
		if (balance > 0) {
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
			}

		}

	}
}
