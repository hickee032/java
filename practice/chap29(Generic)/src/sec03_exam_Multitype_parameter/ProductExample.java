package sec03_exam_Multitype_parameter;

public class ProductExample {

	public static void main(String[] args) {

		Product<Tv, String> p1 = new Product<Tv, String>();
		p1.setT(new Tv(2016,06));
		p1.setM("LG OLED SMART TV");
		
		System.out.println("����TV : "+p1.getT().getYear()+"�� "+p1.getT().getMonth()+"�� �� - "+p1.getM());
		
		Product<Car, String> p2 = new Product<Car, String>();
		p2.setT(new Car("�����ڵ���", 2012, 10));
		p2.setM("SM5");
		System.out.println("���� �ڵ����� "+p2.getT().getBrand()+" "+p2.getT().getYear()+"��"+p2.getT().getMonth()
							+"�� �� - "+p2.getM()+"�̴�.");

	}

}
