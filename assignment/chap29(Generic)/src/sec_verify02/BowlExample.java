package sec_verify02;

public class BowlExample {

	public static void main(String[] args) {

		Bowl<String, String> b1 = new Bowl<String, String>();
		b1.setK("�ڱ���");
		b1.setV("508");
		System.out.println("Ÿ���Ķ���Ϳ� <String, String>���� ��ü ���� �� ���尪 �ҷ�����");
		System.out.println("�̸� : " + b1.getK());
		System.out.println("���� : " + b1.getV());

		Bowl<String, Integer> b2 = new Bowl<String, Integer>();
		b2.setK("�ڱ���");
		b2.setV(65);
		System.out.println(
				"Ÿ���Ķ���Ϳ� <String, Integer>���� ��ü ���� �� ���尪 �ҷ�����" + "\n�̸� : " + b2.getK() + "\n���� : " + b2.getV());

	}

}
