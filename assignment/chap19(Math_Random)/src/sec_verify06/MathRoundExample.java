package sec_verify06;

public class MathRoundExample {

	static double round(double d, int n) {

		double temp1 = d * n;
		double b1 = Math.round(temp1);
		double b2 = b1 / n;
		

		return b2;
	}

	public static void main(String[] args) {

		double dou = 3.17836;

		double d1 = Math.round(dou);
		System.out.print("�ڹٿ��� �����ϴ� Math.round(" + dou + ")�� �� ��� : ");
		System.out.println((int) (d1));
		System.out.println();
		System.out.println("���� ���� round()�� ����� ���");
		System.out.println("Math.round()�� Math.pow()�� �����Ͽ� ����ϴ�.");
		System.out.println();
		double d2 = MathRoundExample.round(dou, 10);
		System.out.println(dou+"�� ��° �ڸ����� �ݿø� �� ��� : "+d2);
		double d3 = MathRoundExample.round(dou, 100);
		System.out.println(dou+"�� ��° �ڸ����� �ݿø� �� ��� : "+d3);
		double d4 = MathRoundExample.round(dou, 1000);
		System.out.println(dou+"�� ��° �ڸ����� �ݿø� �� ��� : "+d4);
		double d5 = MathRoundExample.round(dou, 10000);
		System.out.println(dou+"�� �ټ�° �ڸ����� �ݿø� �� ��� : "+d5);

	}

}
