package sec05_exam_Polymorphism_Array;

public class Product {
	
	int price;//����
	int bounsPoint;//���ʽ� ����

	public Product(int price) {
		this.price = price;
		this.bounsPoint = (int) (this.price / 10.0);//��ǰ ������ 10���� ���ʽ� ����

	}

	public Product() {

	}
}
