package sec04_exam_Polymorphism;

public class Computer extends Product {

	//조상 클래스의 매개변수가 있는 public Product(int price) 생성자 호출
	public Computer() {
		super(300);
	}
	
	@Override
	public String toString() {
		
		return "Computer";
	}
}
