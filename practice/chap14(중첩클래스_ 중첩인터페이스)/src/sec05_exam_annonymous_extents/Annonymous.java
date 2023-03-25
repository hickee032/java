package sec05_exam_annonymous_extents;

public class Annonymous {

	// ��������� �ʱⰪ
	// ���� Ŭ������ Person�� ��� �޴� �͸� �ڼ� (�ڽ�) ��ü�� ����� ����
	// �͸� �ڼհ�ü�� ����� ���� - ui���α׷��̳� �̺�Ʈ ó���ÿ� ��� ����ϴ� �뵵�� ���������.
	// �͸� �ڽ� ��ü�� Ŭ������ ������� �����Ҽ� ������ ��� �̷� ������� ������ �޼��带 �������̵� �Ҷ�
	// �ʿ��� ������ ����ϱ����� ����
	Person field = new Person() {
		// �͸��ڽ� ��ü�� �����ν� �ܺο��� ���� ���� �ȵȴ�.
		// why?�̸��� ���� �Ӵ��� �ν��Ͻ��� �ּҰ� ����Ǿ� �ִ� ���������� �ٺ��� ?"
		int childfield = 2;

		public void work() {
			System.out.println(this.childfield + "�ÿ��� ���� �մϴ�.");
		}

		@Override
		public void wake() {
			System.out.println("6�ÿ� �Ͼ��.");
			this.work();
		}
	};

	public void method() {
		// ���ú����� �ʱⰪ���� �͸� �ڼ� ��ü�� ����
		// �ܺο��� ���� ����.(�޼��� �ȿ����� ���)
		Person localvar = new Person() {
			void walk() {
				System.out.println("��å�մϴ�.");
			}

			@Override
			public void wake() {
				System.out.println("8�ÿ� �Ͼ�ϴ�.");
				this.walk();
			}
		};
		localvar.wake();
	}

	// �Ű������� �Ű������� �͸� �ڼ� ��ü�� �Ѱ��ִ� ����
	public void method2(Person person) {
		if (person instanceof Person) {
			Person p = person;
			p.wake();
		}
	}
}
