package sec04_exam_Polymorphism;

public class Tv extends Product {

	// ���� Ŭ������ �Ű������� �ִ� public Product(int price) ������ ȣ��
	public Tv() {
		super(300);
	}

	@Override
	public String toString() {

		return "Tv";
	}
}
