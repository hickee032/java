package sec07_user_define_exception_01;

public class BalanceInSufficientException extends Exception {

	public BalanceInSufficientException() {

	}

	public BalanceInSufficientException(String message) {

		super(message);// ���� Ŭ������ ������ ȣ��
	}

}
