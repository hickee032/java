package Goods;

import java.util.Scanner;

public class GoodsExample {

	public static void main(String[] args) {

		int input = 0;

		Scanner scan = new Scanner(System.in);

		System.out.print("�� ���� ��ǰ�� �Է� �����ðڽ��ϱ�? : ");
		// �� ���� ��ǰ === �迭
		input = scan.nextInt();

		Goods[] gArr = new Goods[input];

		for (int i = 0; i < gArr.length; i++) {

			System.out.print((i + 1) + "��° ��ǰ �̸�: ");
			String name = scan.next();

			System.out.print((i + 1) + "��° ��ǰ ����: ");
			int price = scan.nextInt();

			System.out.print((i + 1) + "��° ��ǰ ���: ");
			int NumberOfStock = scan.nextInt();

			System.out.print((i + 1) + "��° �ȸ� ����: ");
			int sold = scan.nextInt();

			gArr[i] = new Goods(name, price, NumberOfStock, sold);
		}
		
		System.out.println("�Է��Ͻ� ��ǰ�� �̸�, ����, ���, �ȸ����� �� ��Ȳ�Դϴ�.");
		for (int i = 0; i < gArr.length; i++) {
			// �������̵� �̿�
			System.out.println(gArr[i]);
			// System.out.println(gArr[i].getName() + "");
		}
	scan.close();}

}
