package sec_verify01;

public class MathMethodExample {

	public static void main(String[] args) {
		double number = -2.78987434;

		double numabs = Math.abs(number);
		System.out.println("number�� ���밪 : " + numabs);

		double numceil = Math.ceil(number);
		System.out.println("number�� �ø��� : " + numceil);

		double numfloor = Math.floor(number);
		System.out.println("number�� ������ : " + numfloor);

		double PIrint = Math.rint(3.14);
		System.out.println("PI�� ����� ���� : " + PIrint);

		double doubletwo = Math.sqrt(9.0);
		System.out.println("9.0 �� ������ : " + doubletwo);

		// 0-0.99
		System.out.print("�̹��� ����� �ζ� ��ȣ��");
		for (int i = 0; i < 6; i++) {
			int lottonum = (int) (Math.random() * 50 + 1);
			System.out.print(" " + lottonum + ",");
		}
		System.out.println("�Դϴ�.");

	}

}
