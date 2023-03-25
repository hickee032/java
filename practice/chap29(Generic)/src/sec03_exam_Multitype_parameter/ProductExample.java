package sec03_exam_Multitype_parameter;

public class ProductExample {

	public static void main(String[] args) {

		Product<Tv, String> p1 = new Product<Tv, String>();
		p1.setT(new Tv(2016,06));
		p1.setM("LG OLED SMART TV");
		
		System.out.println("나의TV : "+p1.getT().getYear()+"년 "+p1.getT().getMonth()+"월 식 - "+p1.getM());
		
		Product<Car, String> p2 = new Product<Car, String>();
		p2.setT(new Car("현대자동차", 2012, 10));
		p2.setM("SM5");
		System.out.println("나의 자동차는 "+p2.getT().getBrand()+" "+p2.getT().getYear()+"년"+p2.getT().getMonth()
							+"월 식 - "+p2.getM()+"이다.");

	}

}
