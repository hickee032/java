package sec06_exam_Polymorphism_Vector.copy;
//����Ŭ����
public class Product {
	
	int price;//����
	int bounsPoint;//���ʽ� ����
//�Ű������� �ִ� ������
	public Product(int price) {
		this.price = price;
		this.bounsPoint = (int) (this.price / 10.0);//��ǰ ������ 10���� ���ʽ� ����

	}
//�⺻������
	public Product() {
		this.price = 0;
		this.bounsPoint = 0;
	}
}
