package sec_verify07;

public class MyException extends Exception { // �Ϲ� ����

	private static final long serialVersionUID = 582795131902647716L;

	// �ƹ��� �޼����� ���� ���� ��츦 ����ؼ� ����� �ش�.

	// ����� ���� Ŭ������ ����� ����
	public MyException() {

	}

	public MyException(String message) {
		super(message);
	}

}
