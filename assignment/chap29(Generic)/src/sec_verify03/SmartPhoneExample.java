package sec_verify03;

public class SmartPhoneExample {

	public static void main(String[] args) {

		SmartPhone<String, String, Double> c1 = new SmartPhone<String, String, Double>();
		c1.setCompany("�Ｚ");
		c1.setModel("������5");
		c1.setInch(5.5);
		System.out.println("Ÿ���Ķ���Ϳ� <String, String, Double>���� ��ü ���� �� ���尪 �ҷ�����");
		System.out.println("ȸ�� : "+c1.getCompany()+"\n�� : "+c1.getModel()+"\n��ġ : "+c1.getInch());
		
		System.out.println();
		SmartPhone<String, String, String> c2 = new SmartPhone<String, String, String>();
		c2.setCompany("LG����");
		c2.setModel("V20");
		c2.setInch("6.0");
		System.out.println("Ÿ���Ķ���Ϳ� <String, String, String>���� ��ü ���� �� ���尪 �ҷ�����");
		System.out.println("ȸ�� : "+c2.getCompany()+"\n�� : "+c2.getModel()+"\n��ġ : "+c2.getInch());

	}

}
