package sec04_exam_Card;

public class DeckExample {

	public static void main(String[] args) {

		Deck d = new Deck(); //기본생성자 호출
		Card c = d.pick();

		System.out.println("카드 섞기 전 제일 위에 있는 카드");
		System.out.println(c.toString());

		d.shuffle();

		c = d.pick(0);
		System.out.println("카드 섞은 후 제일 위에 있는 카드");
		System.out.println(c.toString());

		c = d.pick(10);

		System.out.println("카드 섞기 후 11번째에 있는 카드");
		System.out.println(c.toString());

		c = d.pick();
		System.out.println("카드를 임의로 뽑아 본 카드");
		System.out.println(c.toString());

	}

}
