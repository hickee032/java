package sec_verify05;

public class CircleExample {

	public static void main(String[] args) {
		Circle c1 = new Circle(1, 2, 10);
		Circle c2 = new Circle(5, 6, 10);
		
		System.out.println("�� 1 :" + c1.toString());
		System.out.println("�� 2 :" + c2.toString());
		
		if(c1.equals(c2)) {
			System.out.println("�� 1�� �� 2�� ���� ���Դϴ�.");
		}
		else {
			System.out.println("�� 1�� �� 2�� �ٸ� ���Դϴ�.");
		}

	}

}
