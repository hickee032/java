package sec06_exam_initializeblock;

public class ProductExample {

	public static void main(String[] args) {


		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1 �ø��� �ѹ� "+ p1.serialNO);
		System.out.println("p2 �ø��� �ѹ� "+ p2.serialNO);
		System.out.println("p3 �ø��� �ѹ� "+ p3.serialNO);
		System.out.println("����� ��ǰ�� ���� " + Product.count+"��");

	}

}
