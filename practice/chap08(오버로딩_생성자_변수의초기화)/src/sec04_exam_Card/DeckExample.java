package sec04_exam_Card;

public class DeckExample {

	public static void main(String[] args) {

		Deck d = new Deck(); //�⺻������ ȣ��
		Card c = d.pick();

		System.out.println("ī�� ���� �� ���� ���� �ִ� ī��");
		System.out.println(c.toString());

		d.shuffle();

		c = d.pick(0);
		System.out.println("ī�� ���� �� ���� ���� �ִ� ī��");
		System.out.println(c.toString());

		c = d.pick(10);

		System.out.println("ī�� ���� �� 11��°�� �ִ� ī��");
		System.out.println(c.toString());

		c = d.pick();
		System.out.println("ī�带 ���Ƿ� �̾� �� ī��");
		System.out.println(c.toString());

	}

}
