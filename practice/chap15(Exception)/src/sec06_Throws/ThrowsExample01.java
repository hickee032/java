package sec06_Throws;

public class ThrowsExample01 {

	public static void main(String[] args) {
		method1(); /*
					 * �̷��� ���� �޼��� �ȿ��� �ٸ� �޼����� �޼���1�� ȣ������ �� 
					 * ���ܸ� ���ѱ�� �ֱ� ������ ���ο��� �ݵ�� ���� ó�� �ڵ尡
					 * �����Ѵ�.
					 */
		
	//	1.main() ���� throws Exception ���δ�.
	//	2.try catch������ ���� ���� ó���� �Ѵ�.
	}

	public static void method1() throws Exception {
		method2();

	}

	public static void method2() throws Exception {
		throw new Exception("���� �߻�");

	}
}
