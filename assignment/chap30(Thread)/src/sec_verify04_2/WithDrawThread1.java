package sec_verify04_2;

public class WithDrawThread1 extends Thread {

	private Account account;

	public void setAccount(Account account) {
		this.account = account;
		this.setName("����");
		
	}

	@Override
	public void run() {
		
	}

}
