package sec06_Throws;

public class ThrowsExample02 {

	public static void main(String[] args) {

		try {
			method1();
		} catch (Exception e) {
			System.out.println("���ο��� ���� ó��");
			e.printStackTrace();
		}

	} // main()��

	// method1 ���� ���ѱ���ϴ� ��
	public static void method1() throws Exception {
		throw new Exception("���� �߻�");
	}
}
