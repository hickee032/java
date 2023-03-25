package sec07_user_define_exception_01;

public class AccountExample {

	public static void main(String[] args) {
		
		//사용자 정의 예외는 왠만하면 try catch문으로 감싸줘라~~~~~~
		Account ac = new Account();

		ac.deposit(100000);

		System.out.println("잔액 - " + ac.getbalance());
		//출금하기 (예외 발생 코드를 필히 작성해야함)
		try {
			ac.withdrow(1000);
			ac.withdrow(1000000);
			System.out.println("잔액 - " + ac.getbalance());
			
		} catch (BalanceInSufficientException e) {
			System.out.println("예외 원인 - "+e.getMessage());
		}

	}

}
