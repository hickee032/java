package sec02_exam_Nested_Class;

public class Main {

	public static void main(String[] args) {

		A a = new A(); // �ܺ� �ٱ� Ŭ���� �ν��Ͻ� ����
		// AŬ������ ��� �������� ���� ��ø Ŭ���� �ν��Ͻ� ����
		// �ݵ�� �ܺ� Ŭ������ �ν��Ͻ��� ���� �Ͽ��� �Ѵ�.
		A.B b = a.new B();

		b.method1();// b �� ��� �޼��� method1ȣ��

		// ���� static ����� �ν��Ͻ� ����
		// (�ܺ� Ŭ������ �ν��Ͻ� ���� ���� �ٷ� �����ϴ�.)
		A.C c = new A.C();

		System.out.println(c.b);
		A.C.method3();

		// �ܺ� Ŭ������ ��� �޼����� method�� ȣ�� ������ ��
		// ���� Ŭ������ �ν��Ͻ��� ����
		a.method();

	}

}
