package sec07_user_define_exception_01;

public class AccountExample {

	public static void main(String[] args) {
		
		//����� ���� ���ܴ� �ظ��ϸ� try catch������ �������~~~~~~
		Account ac = new Account();

		ac.deposit(100000);

		System.out.println("�ܾ� - " + ac.getbalance());
		//����ϱ� (���� �߻� �ڵ带 ���� �ۼ��ؾ���)
		try {
			ac.withdrow(1000);
			ac.withdrow(1000000);
			System.out.println("�ܾ� - " + ac.getbalance());
			
		} catch (BalanceInSufficientException e) {
			System.out.println("���� ���� - "+e.getMessage());
		}

	}

}
