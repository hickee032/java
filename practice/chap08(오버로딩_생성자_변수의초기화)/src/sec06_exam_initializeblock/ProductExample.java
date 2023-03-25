package sec06_exam_initializeblock;

public class ProductExample {

	public static void main(String[] args) {


		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1 시리얼 넘버 "+ p1.serialNO);
		System.out.println("p2 시리얼 넘버 "+ p2.serialNO);
		System.out.println("p3 시리얼 넘버 "+ p3.serialNO);
		System.out.println("생산된 제품의 수는 " + Product.count+"개");

	}

}
