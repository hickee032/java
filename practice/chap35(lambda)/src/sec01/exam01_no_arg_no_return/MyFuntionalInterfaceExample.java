package sec01.exam01_no_arg_no_return;

public class MyFuntionalInterfaceExample {
	public static void main(String[] args) {

		MyFuntionalInterface fi1 = new MyFuntionalInterface() {

			@Override
			public void method() {
				String str = "���� �͸�����ü ������";
				System.out.println(str);

			}
		};
		fi1.method();
		// ���ٽ��� �̿��ؼ� �͸�����ü�� �����ϰ� �ִ�.
		// �Ű������� ������()���� �Ұ��ΰ� �˰��ִ�.
		// {}�ȿ��� �߻�޼����� ������ �� -�� �����ΰ� �����Ѵ�.

		// ���ٽ�

		fi1 = () -> {
			String str = "���ٽ� �͸�����ü ������";
			System.out.println(str);
		};
		fi1.method();
		// ���๮�� 1�� �� ��쿡�� {}������ �����ϴ�.
		fi1 = () -> System.out.println("��� ���ٽ� �͸�����ü ������");
		fi1.method();

		// ��� �͸�����ü�� �����Ҷ� �ڵ��� �������� ���ٽ��� ����Ҽ��ִ�.
	}

}
