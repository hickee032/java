package sec06_Throws;

public class ThrowsExample03 {

	public static void main(String[] args) {

		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ �����ϴ�.");
			e.printStackTrace();
		}

		catch (Exception e) {
			System.out.println("�˼� ���� ���ܰ� �߻��߽��ϴ�.");
			e.printStackTrace();
		}

	}

	public static void findClass() throws ClassNotFoundException {
		// .forName() �����޼���� �Ϲ� ���ܸ� �߻���Ų��.-->ClassNotFoundException
		Class c = Class.forName("java.lang.String2");
	}
}
