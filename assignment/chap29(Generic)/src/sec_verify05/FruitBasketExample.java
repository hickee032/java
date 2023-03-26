package sec_verify05;

import java.util.Scanner;

public class FruitBasketExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.print("과일명 - ");
			String fruitname = sc.nextLine();
			System.out.print("가격 - ");
			int price = sc.nextInt();
			sc.nextLine();
			Fruit<String, Integer> a = FruitBasket.basketing(fruitname, price);
			if (i == 0) {
				System.out.println("Fruit바구니에 과일이 담겼네요.");
			} else {
				System.out.println("Fruit바구니에 또 과일이 담겼네요.");
			}
			System.out.println("과일명 : " + a.getK() + "\n가격 : " + a.getV());

		}
		sc.close();

	}

}
