package sce01.exam02_arugment;

public class MyFuntionalInterfaceExample {

	public static void main(String[] args) {
		MyFuntionalInterface fi = null;
		fi = (x) -> {
			int result = x * 5;
			System.out.println("result : " + result);
		};
		fi.method(10);

		// ���ǥ��
		// �Ű������� �ϳ��� ��쿡��()����
		// �ƿ﷯ ���๮ �ϳ��ϰ�쵵 {} ��������
		fi = x -> System.out.println("result : " + x * 5);
		fi.method(10);
	}

}
