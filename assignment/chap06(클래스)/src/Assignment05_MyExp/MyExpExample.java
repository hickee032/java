package Assignment05_MyExp;

public class MyExpExample {

	public static void main(String[] args) {

		MyExp myexp = new MyExp();

		// base �� , �ʱ�ȭ

		myexp.base = 2;

		myexp.exp = 3;

		System.out.print(myexp.base + "�� ");

		System.out.print(myexp.exp + "�� = ");

		int result = myexp.getValue(); // ���� ����� result�� ó���Ѵ�.

		System.out.println(result);

		myexp.base = 3;

		myexp.exp = 4;

		System.out.print(myexp.base + "�� ");

		System.out.print(myexp.exp + "�� = ");

		result = myexp.getValue();

		System.out.print(result);

	}

}
