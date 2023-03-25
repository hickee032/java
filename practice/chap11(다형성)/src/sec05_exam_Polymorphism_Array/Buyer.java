package sec05_exam_Polymorphism_Array;

public class Buyer {
	int money = 1000;
	int bounsPoint = 0;

	Product[] item = new Product[10];
	int i = 0;

	public void buy(Product p) {
		if (this.money < p.price) {
			System.out.println("�ܾ� ����");
			return;
		}
		this.money -= p.price;
		this.bounsPoint += p.bounsPoint;
		this.item[i++] = p;
		System.out.println(p + "�� �����ϼ̽��ϴ�.");
	}

	public void summary() {
		int sum = 0;
		String itemList = "";
//�ݺ����� �̿��ؼ� ������ ��ǰ�� �Ѱ��ݰ� ����� �����.
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
		System.out.println("�����Ͻ� ��ǰ�� �� �ݾ��� " + sum + "�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
	}
}
