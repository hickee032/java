package sec04_exam_Polymorphism;

public class PolyArgumentExample {

	public static void main(String[] args) {

		Buyer b = new Buyer();
		Tv tv = new Tv();

		b.buy(tv);
		b.buy(new Tv());
		b.buy(new Computer());

		System.out.println("남은 돈 " + b.money);
		System.out.println("포인트" + b.bonusPoint);
	}

}
