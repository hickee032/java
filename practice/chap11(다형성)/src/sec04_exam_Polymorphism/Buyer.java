package sec04_exam_Polymorphism;

public class Buyer {

	int money = 1000;
	int bonusPoint = 0;

	// 매개변수 Product p의 개념을 정확히 이해하는 것이 중요
	// Product뿐 아니라 Product를 상속받는 어떤 클래스라도 다 매개변수로 들어 올수있음
	public void buy(Product p) {
		// 가진 돈 보다 제품의 가격이 비싼 경우
		if (this.money < p.price) {
			System.out.println("잔액 부족");
			return;
		}
		// 가진돈에서 구입한 제품의 가격을 뺀다.
		this.money -= p.price;
		// 제품의 보너스 점수추가
		this.bonusPoint += p.bonusPoint;

		System.out.println(p + "구입");
	}

}
