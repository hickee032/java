package sec04_exam_Polymorphism;

//매개변수의 다양성
//조상클래스
public class Product {

	int price; // 제품 가격
	int bonusPoint; // 제품 구매시 제공하는 보너스 점수

	public Product(int price) {
		this.price = price;

		// 보너스 제품가격의 10% 적립.
		this.bonusPoint = (int) (price / 10.0);
	}
}
