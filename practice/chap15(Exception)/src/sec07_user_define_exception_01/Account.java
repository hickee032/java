package sec07_user_define_exception_01;

public class Account {

	private long balance;

	public Account() {

	}

	// ���� �ܾ�
	public long getbalance() {
		return this.balance;

	}

	// �Ա�
	public void deposit(int money) {
		this.balance += money;
	}

	// ���
	public void withdrow(int money) throws BalanceInSufficientException {
		if (this.balance < money) {
			throw new BalanceInSufficientException("�ܰ���� : " + (money - this.getbalance()) + "���ڶ�");// ���� �߻�
		} else {
			this.balance -= money;
		}
	}
}
