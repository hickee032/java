package sec04_exam_Polymorphism;

public class PolyArgumentExample {

	public static void main(String[] args) {

		Buyer b = new Buyer();
		Tv tv = new Tv();

		b.buy(tv);
		b.buy(new Tv());
		b.buy(new Computer());

		System.out.println("���� �� " + b.money);
		System.out.println("����Ʈ" + b.bonusPoint);
	}

}
