package sec07_user_define_exception_01;

public class BalanceInSufficientException extends Exception {

	public BalanceInSufficientException() {

	}

	public BalanceInSufficientException(String message) {

		super(message);// 조상 클래스의 생성자 호출
	}

}
