package sec_verify03;

public class EqualsExample {

	public static void main(String[] args) {
		System.out.println("���� ������ �ν��Ͻ��̴�.");

		Point num1 = new Point(2, 3);
		Point num2 = new Point(2, 3);
		Point num3 = new Point(3, 4);

//		System.out.println("Point num1�� �ʵ� ��  : x - " + num1.getX() + "�̸� y - " + num1.getY() + "�̴�.");
//		System.out.println("Point num2�� �ʵ� ��  : x - " + num2.getX() + "�̸� y - " + num2.getY() + "�̴�.");
//		System.out.println("Point num3�� �ʵ� ��  : x - " + num3.getX() + "�̸� y - " + num3.getY() + "�̴�.");
		
		System.out.println("Point num1�� �ʵ� ��  : " + num1.toString());
		System.out.println("Point num1�� �ʵ� ��  : " + num2.toString());
		System.out.println("Point num1�� �ʵ� ��  : " + num3.toString());

		if (num1.equals(num2)) {
			System.out.println("num1�� �ʵ�� num2�� �ʵ�� ����.");
		} else {
			System.out.println("num1�� �ʵ�� num2�� �ʵ�� �ٸ���.");
		}
	}

}
