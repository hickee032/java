package sec_verify01;

public class BoxingExample {

	public static void main(String[] args) {
		int i = 10;
		Integer intObject = i;
		System.out.println("i�� �ڵ� �ڽ���  intObject�� �� :  " + intObject);
		i = intObject;
		System.out.println("intObject�� i�� �ڵ���ڽ��� �� : " + i);

	}

}
