package sec05_exam_Polymorphism_Array;

public class Buyer {
	int money = 1000;
	int bounsPoint = 0;

	Product[] item = new Product[10];
	int i = 0;

	public void buy(Product p) {
		if (this.money < p.price) {
			System.out.println("잔액 부족");
			return;
		}
		this.money -= p.price;
		this.bounsPoint += p.bounsPoint;
		this.item[i++] = p;
		System.out.println(p + "을 구입하셨습니다.");
	}

	public void summary() {
		int sum = 0;
		String itemList = "";
//반복문을 이용해서 구입한 물품의 총가격과 목록을 만든다.
		for (int i = 0; i < item.length; i++) {
			if (item[i] == null) {
				break;
			}
			sum += this.item[i].price;
			if (i == 9)
				itemList += this.item[i];
			else
				itemList += this.item[i] + ",";
		}
		System.out.println("구입하신 물품의 총 금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}
