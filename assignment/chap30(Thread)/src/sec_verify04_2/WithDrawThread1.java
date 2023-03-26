package sec_verify04_2;

public class WithDrawThread1 extends Thread {

	private Account account;

	public void setAccount(Account account) {
		this.account = account;
		this.setName("¾ö¸¶");
		
	}

	@Override
	public void run() {
		
	}

}
