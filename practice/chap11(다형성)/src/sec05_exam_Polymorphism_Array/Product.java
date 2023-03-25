package sec05_exam_Polymorphism_Array;

public class Product {
	
	int price;//가격
	int bounsPoint;//보너스 점수

	public Product(int price) {
		this.price = price;
		this.bounsPoint = (int) (this.price / 10.0);//제품 가격의 10프로 보너스 가격

	}

	public Product() {

	}
}
