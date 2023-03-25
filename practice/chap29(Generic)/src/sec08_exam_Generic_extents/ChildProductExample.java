package sec08_exam_Generic_extents;

public class ChildProductExample {

	public static void main(String[] args) {

		//필드의 다형성
		Product<Tv, String> product = new ChildProduct<>();
		product.setKind(new Tv());
		product.setMode("캡션 Tv");
		//product.setCompany("삼성"); //product의 근본은 Product<Tv, String>
		
		System.out.println("Tv의 모드 : "+product.getMode());
		
		ChildProduct<Tv, String, String> cProduct = new ChildProduct<>();
		cProduct.setKind(new Tv());
		cProduct.setMode("스마트 Tv");
		cProduct.setCompany("LG");
		
		System.out.println("회사 : " + cProduct.getCompany()+", "+"모델 : "+cProduct.getMode()); 
	}

}
