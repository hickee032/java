package sec06_exam_Polymorphism_Vector.copy;
//조상클래스
public class Product {
	
	int price;//가격
	int bounsPoint;//보너스 점수
//매개변수가 있는 생성자
	public Product(int price) {
		this.price = price;
		this.bounsPoint = (int) (this.price / 10.0);//제품 가격의 10프로 보너스 가격

	}
//기본생성자
	public Product() {
		this.price = 0;
		this.bounsPoint = 0;
	}
}
