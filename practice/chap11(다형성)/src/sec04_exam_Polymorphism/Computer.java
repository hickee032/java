package sec04_exam_Polymorphism;

public class Computer extends Product {

	//���� Ŭ������ �Ű������� �ִ� public Product(int price) ������ ȣ��
	public Computer() {
		super(300);
	}
	
	@Override
	public String toString() {
		
		return "Computer";
	}
}
