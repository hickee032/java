package sec01.exam03_return;

public class MyFuntionalInterfaceExample {

	public static void main(String[] args) {

		MyFuntionalInterface fi = null;

		// fi = x,y,->{}; //�Ű������� 2���ϰ�쿡�� ()���� �Ұ��ϴ�.

		fi = (x, y) -> {
			int result = x + y;
			return result;
		};

		int result = fi.method(10, 100);
		System.out.println("�Ű������� 2�� �׸��� ���ϰ��� �ִ� �Լ��� �������̽��� ������ ��"+result);

		//��� ǥ��
		fi=(x,y) -> {return x+y;};
		System.out.println("�Ű������� 2�� �׸��� ���ϰ��� �ִ� �Լ��� �������̽��� ������ ��"+fi.method(50, 100));
		
		fi = (x,y)->x+y;
		System.out.println("�Ű������� 2�� �׸��� ���ϰ��� �ִ� �Լ��� �������̽��� ������ ��"+fi.method(150, 100));
		
		fi = (x,y)->sum(x,y);
		System.out.println("�Ű������� 2�� �׸��� ���ϰ��� �ִ� �Լ��� �������̽��� ������ ��"+fi.method(350, 100));
	}

	public static int sum(int x, int y) {
		return x + y;

	}

}
