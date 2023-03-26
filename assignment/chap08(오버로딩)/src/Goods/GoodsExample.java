package Goods;

import java.util.Scanner;

public class GoodsExample {

	public static void main(String[] args) {

		int input = 0;

		Scanner scan = new Scanner(System.in);

		System.out.print("몇 개의 상품을 입력 받으시겠습니까? : ");
		// 몇 개의 상품 === 배열
		input = scan.nextInt();

		Goods[] gArr = new Goods[input];

		for (int i = 0; i < gArr.length; i++) {

			System.out.print((i + 1) + "번째 상품 이름: ");
			String name = scan.next();

			System.out.print((i + 1) + "번째 상품 가격: ");
			int price = scan.nextInt();

			System.out.print((i + 1) + "번째 상품 재고: ");
			int NumberOfStock = scan.nextInt();

			System.out.print((i + 1) + "번째 팔린 수량: ");
			int sold = scan.nextInt();

			gArr[i] = new Goods(name, price, NumberOfStock, sold);
		}
		
		System.out.println("입력하신 상품의 이름, 가격, 재고, 팔린수량 의 현황입니다.");
		for (int i = 0; i < gArr.length; i++) {
			// 오버라이딩 이용
			System.out.println(gArr[i]);
			// System.out.println(gArr[i].getName() + "");
		}
	scan.close();}

}
