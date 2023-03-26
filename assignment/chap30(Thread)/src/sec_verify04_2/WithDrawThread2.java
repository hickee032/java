package sec_verify04_2;

public class WithDrawThread2 extends Thread {

	private Account account;

	public void setAccount(Account account) {
		this.account = account;
		this.setName("พฦต้");
		
	}

	@Override
	public void run() {

	}
}
