package sec_verify04;

public class ProductExample {

	public static void main(String[] args) {
		Product<Audio, Monitor> sr = new Product<Audio, Monitor>();
		sr.setA(new Audio("Sony", "�ֻ�", 4));
		sr.setM(new Monitor("�Ｚ", 27, 350000));

		System.out.println("�� ������� " + sr.getA().getBrand() + "������ �̸�, ������ " + sr.getA().getQuality() + "�̰� "
				+ sr.getA().getChannel() + "ä���̴�.");
		System.out.println();
		System.out.println("������� ��\n" + "�귣�� : " + sr.getM().getCompany() + "\n��ġ : " + sr.getM().getInch() + "\n���� : "
				+ sr.getM().getPrice());

	}

}
