package sec04_exam_Polymorphism;

public class Buyer {

	int money = 1000;
	int bonusPoint = 0;

	// �Ű����� Product p�� ������ ��Ȯ�� �����ϴ� ���� �߿�
	// Product�� �ƴ϶� Product�� ��ӹ޴� � Ŭ������ �� �Ű������� ��� �ü�����
	public void buy(Product p) {
		// ���� �� ���� ��ǰ�� ������ ��� ���
		if (this.money < p.price) {
			System.out.println("�ܾ� ����");
			return;
		}
		// ���������� ������ ��ǰ�� ������ ����.
		this.money -= p.price;
		// ��ǰ�� ���ʽ� �����߰�
		this.bonusPoint += p.bonusPoint;

		System.out.println(p + "����");
	}

}
