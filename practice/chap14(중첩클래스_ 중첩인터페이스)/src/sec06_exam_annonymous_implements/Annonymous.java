package sec06_exam_annonymous_implements;

public class Annonymous {
	RemoteControl field = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("TV�� �Ѵ�");

		}

		@Override
		public void turnOff() {
			System.out.println("TV�� ����");

		}
	};

	public void method1() {
		//���ú����� �������̽� Ÿ���� ������ �͸� ������ü ����
		RemoteControl localvar = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("������� �Ѵ�");

			}

			@Override
			public void turnOff() {
				System.out.println("������� ����");

			}
		};
		localvar.turnOn();
		localvar.turnOff();
	}
	//�Ű������� �������̽� Ÿ���� ���Դ� �� �ǹ̴� ??
	void method2(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
}
