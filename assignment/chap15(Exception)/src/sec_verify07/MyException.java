package sec_verify07;

public class MyException extends Exception { // 일반 예외

	private static final long serialVersionUID = 582795131902647716L;

	// 아무런 메세지를 주지 않을 경우를 대비해서 만들어 준다.

	// 사용자 정의 클래스를 만드는 공식
	public MyException() {

	}

	public MyException(String message) {
		super(message);
	}

}
