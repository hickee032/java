package sec_verify04;

public class RectExample {

	public static void main(String[] args) {

		Rect num1 = new Rect(5, 15);
		Rect num2 = new Rect(15, 5);
		Rect num3 = new Rect(3, 10);

		System.out.println("���� ������ �ν��Ͻ��̴�.");
		System.out.println("Rect num1�� �ʵ� ��  : " + num1.toString());
		System.out.println("Rect num2�� �ʵ� ��  : " + num2.toString());
		System.out.println("Rect num3�� �ʵ� ��  : " + num3.toString());
		
		if(num1.equals(num2)) {
			System.out.println("rect1�簢�� ������ rect2�簢�� ������ ����.");
		}
		else {
			System.out.println("rect1�簢�� ������ rect2�簢�� ������ �ٸ���.");
		}
	}

}
