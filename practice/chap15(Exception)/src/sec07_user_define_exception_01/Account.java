package sec07_user_define_exception_01;

public class Account {

	private long balance;

	public Account() {

	}

	// 현재 잔액
	public long getbalance() {
		return this.balance;

	}

	// 입금
	public void deposit(int money) {
		this.balance += money;
	}

	// 출금
	public void withdrow(int money) throws BalanceInSufficientException {
		if (this.balance < money) {
			throw new BalanceInSufficientException("잔고부족 : " + (money - this.getbalance()) + "모자람");// 예외 발생
		} else {
			this.balance -= money;
		}
	}
}
