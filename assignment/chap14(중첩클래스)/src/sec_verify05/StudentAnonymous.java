package sec_verify05;

public class StudentAnonymous {

	Student field = new Student("������") {

		public void goSchool() {

			System.out.println(field.name + "�� ��մϴ�.");
			System.out.println("=============================");
		}

		@Override
		public void wake() {
			System.out.println("=============================");
			System.out.println("�ʵ�(�������)�� �ʱⰪ���� ������ �ڽİ�ü");
			System.out.println(field.name + "�� 6�ÿ� �Ͼ�ϴ�.");
			this.goSchool();
		}
	};

	void method1() {

		Student field = new Student("���ѱ�") {

			public void goMoving() {
				System.out.println(this.name + "�� ��ȭ�� ���� ���ϴ�.");
			}

			@Override
			public void wake() {
				System.out.println("���ú����� �ʱⰪ���� ������ �ڽ� ��ü");
				System.out.println(this.name + "�� 9�ÿ� �Ͼ�ϴ�.");
				this.goMoving();
			}
		};
		field.wake();

	}

	void method2(Student student) {
		student = new Student("�迬��") {

			public void study() {
				System.out.println(this.name + "�� �����մϴ�.");
				System.out.println("==============================");
			}

			@Override
			public void wake() {
				System.out.println("==============================");
				System.out.println("�Ű������� �Ű������� �͸��ڼհ�ü�� ����");
				System.out.println(this.name + "�� 4�ÿ� �Ͼ�ϴ�.");
				this.study();
			}

		};

		student.wake();

	}
}