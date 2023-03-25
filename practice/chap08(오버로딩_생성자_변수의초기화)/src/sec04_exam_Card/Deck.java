package sec04_exam_Card;

public class Deck {

	final int CARD_NUM = 52; // ī���� ����
	// ��ü�迭(2���� �迭Ÿ��)
	Card[] c = new Card[CARD_NUM];

	// �⺻������
	public Deck() {
		int i = 0;
		// 52���� ���鼭 ī�带 c[]�� �ʱ�ȭ�� ��
		for (int k = Card.KIND_MAX; k > 0; k--) {
			for (int n = 1; n < Card.NUM_MAX + 1; n++) {
				c[i++] = new Card(k, n);
			}
		}
		// ���� �ʱ�ȭ�� ������ ���� ����غ�
		for (int j = 0; j < c.length; j++) {
			System.out.printf("C[%d]�� ���� : %d ,C[%d]�� ���� : %d", j, c[j].kind, j, c[j].number);
			System.out.println();
		}
	}

	// ������ ��ġ(index)�� �ִ� ī�� �ϳ��� �����Ѵ�.
	public Card pick(int index) {
		if (0 <= index && index < CARD_NUM)
			return c[index];
		else
			return pick();
	}

	// Deck���� ī�� �ϳ��� �����Ѵ�.
	public Card pick() {
		int index = (int) (Math.random() * CARD_NUM);
		System.out.print("���Ƿ� ���� ī�� :");
		System.out.printf("%d", index);
		return pick(index);
	}

	public void shuffle() {
		// ī���� ������ ���´�.
		for (int n = 0; n < 1000; n++) {
			int i = (int) (Math.random() * CARD_NUM);
			// ���ǹ��� ���⶧���� �׳� �����´�.
			Card temp = c[0];
			c[0] = c[i];
			c[i] = temp;
		}
		System.out.println();
		System.out.println("ī�� ���� �� ��� �Դϴ�.");
		// ī�� ���� �� ����غ�
		for (int j = 0; j < c.length; j++) {
			System.out.printf("C[%d]�� ���� : %d ,C[%d]�� ���� : %d", j, c[j].kind, j, c[j].number);
			System.out.println();
		}
	}
}
