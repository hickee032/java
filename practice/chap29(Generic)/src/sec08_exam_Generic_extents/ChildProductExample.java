package sec08_exam_Generic_extents;

public class ChildProductExample {

	public static void main(String[] args) {

		//�ʵ��� ������
		Product<Tv, String> product = new ChildProduct<>();
		product.setKind(new Tv());
		product.setMode("ĸ�� Tv");
		//product.setCompany("�Ｚ"); //product�� �ٺ��� Product<Tv, String>
		
		System.out.println("Tv�� ��� : "+product.getMode());
		
		ChildProduct<Tv, String, String> cProduct = new ChildProduct<>();
		cProduct.setKind(new Tv());
		cProduct.setMode("����Ʈ Tv");
		cProduct.setCompany("LG");
		
		System.out.println("ȸ�� : " + cProduct.getCompany()+", "+"�� : "+cProduct.getMode()); 
	}

}
