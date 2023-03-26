package sec_verify03;

public class SmartPhoneExample {

	public static void main(String[] args) {

		SmartPhone<String, String, Double> c1 = new SmartPhone<String, String, Double>();
		c1.setCompany("삼성");
		c1.setModel("갤럭시5");
		c1.setInch(5.5);
		System.out.println("타입파라메터에 <String, String, Double>으로 객체 생성 후 저장값 불러오기");
		System.out.println("회사 : "+c1.getCompany()+"\n모델 : "+c1.getModel()+"\n인치 : "+c1.getInch());
		
		System.out.println();
		SmartPhone<String, String, String> c2 = new SmartPhone<String, String, String>();
		c2.setCompany("LG전자");
		c2.setModel("V20");
		c2.setInch("6.0");
		System.out.println("타입파라메터에 <String, String, String>으로 객체 생성 후 저장값 불러오기");
		System.out.println("회사 : "+c2.getCompany()+"\n모델 : "+c2.getModel()+"\n인치 : "+c2.getInch());

	}

}
