package sec_verify05;

import java.util.Scanner;

public class FruitBasketExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.print("���ϸ� - ");
			String fruitname = sc.nextLine();
			System.out.print("���� - ");
			int price = sc.nextInt();
			sc.nextLine();
			Fruit<String, Integer> a = FruitBasket.basketing(fruitname, price);
			if (i == 0) {
				System.out.println("Fruit�ٱ��Ͽ� ������ ���׿�.");
			} else {
				System.out.println("Fruit�ٱ��Ͽ� �� ������ ���׿�.");
			}
			System.out.println("���ϸ� : " + a.getK() + "\n���� : " + a.getV());

		}
		sc.close();

	}

}
