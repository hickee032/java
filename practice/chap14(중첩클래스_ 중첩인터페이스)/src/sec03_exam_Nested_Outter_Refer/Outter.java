package sec03_exam_Nested_Outter_Refer;

public class Outter {

	// �ܺ� Ŭ����(Outter)���
	String field = "Outter_field";

	public void method() {
		System.out.println("�ܺ� Ŭ���� �޼��� ȣ��");
	}

	class Nested {
		String field = "Nested_field";

		public void method() {
			System.out.println("���� Ŭ���� �޼��� ȣ��");
		}

		public void print() {

			// �ܺ� Ŭ���� ��� ���� ��� (�ܺ� Ŭ���� �� . this . ���)
			System.out.println(Outter.this.field);
			Outter.this.method();

			// ���� Ŭ���� ��� ���� ��� (this . ���)
			System.out.println(this.field);
			this.method();
		}
	}

}
