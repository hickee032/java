package sec06_exam_Polymorphism_Vector.copy;

import java.util.Vector;

public class Buyer {

	int money = 100000;
	int bonusPoint = 0;

	// �÷��� ������ ��ũ�� ����Ʈ �迭�� �ϳ��� Vector (JDK1.2)�� �ν��Ͻ� ����
	// Vector�� �⺻������ 10���� ���� ���� ���ش�.
	// 10���� �Ѿ�� �ڵ����� �þ��. �Ͽ� ������ �迭�� ���Ͽ� ����� ������ �迭�����̴�.
	// �迭����̱� ������ �ε����� ���� ���� ������ �����ϴ�.
	Vector item = new Vector();

	void buy(Product p) {
		if (this.money < p.price) {
			System.out.println("�ܾ׺���");
			return;
		}
		this.money -= p.price;
		this.bonusPoint += p.bounsPoint;

		this.item.add(p); // �Ű������� �Ѿ�� ��ǰ�� vector�� �߰�(�ڿ��ٰ� �ϳ��� �߰���)
		System.out.println(p.toString() + "�� �����ϼ̽��ϴ�.");

	}

	public void refund(Product p) {
		if (item.remove(p)) {
			this.money += p.price; // ȯ�� ���� �ݾ� ����.
			this.bonusPoint -= p.bounsPoint;
			System.out.println(p + " ��ǰ");
		} else {
			System.out.println("�����Ͻ� ��ǰ��� �� �ش��ϴ� ��ǰ�� �������� �ʽ��ϴ�.");
		}
	}

	// ������ ��ǰ������ ������ ����ϴ� summary()�޼���
	public void summary() {
		int sum = 0;
		String itemList = "";

		if (item.isEmpty()) {
			System.out.println("������ ��ǰ�� ����");
			return;
		}

		for (int i = 0; i < item.size(); i++) {
			// Ÿ�� üũ (true�� ������ ����ȯ ����)
			if (item.get(i) instanceof Product) {
				Product p = (Product) item.get(i); // ���� Ÿ�� ĳ���� �ٿ� ĳ����
				sum += p.price;
				//���׿�����.
				itemList += ((i == 0) ? "" + p : "," + p);
			}
			else {
				System.out.println("Product��ü�� �ƴմϴ�.");
			}

		}
		System.out.println("�� ���� �ݾ� "+sum);
		System.out.println("���� ����Ʈ" + itemList);
	}
}