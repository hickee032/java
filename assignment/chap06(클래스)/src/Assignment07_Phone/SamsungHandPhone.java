package Assignment07_Phone;

public class SamsungHandPhone {
	
	private String company = "Samsung";
	private String model = "Samsung�� ��";
	private String color = "White";
	private int release = 2013;

//==========================================================

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {

		// ����ó��
		if (company != "Samsung") {

			System.out.println("Samsung���� �ƴմϴ�.");

			return;
		}
	}

//==========================================================

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {

		// ����ó��
		if ((model != "Galaxy3")||(model != "Galaxy4")||(model != "Galaxy5")
				||(model != "Galaxy6")||(model != "Galaxy7")||(model != "GalaxyNote)")) {

			System.out.println("Samsung�� ���� �ƴմϴ�.");

			return;
		}

	}

//==========================================================	

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		if ((model == "Galaxy3")||(model == "Galaxy4")||(model == "Galaxy5")
				||(model == "Galaxy6")||(model == "Galaxy7")||(model == "GalaxyNote)")) {
 

			System.out.println("white");

			return;
		}
	}

//==========================================================

	public int getrelease() {
		return this.release;
	}

	public void setrelease(int release) {

		if (release < 0) {

			System.out.println("�⵵ ���� ����?");

			return;
		}

		/*
		 * if (maxSpeed > 0) {
		 * 
		 * System.out.print();
		 * 
		 * return; }
		 */

	}

	@Override //Annotation �����Ϸ����� �������� ���ϰ� �ض�.
	public String toString() {
		String str = this.getCompany() + "�� " + this.getColor() + "�����̸�" + this.getModel() + "�̰� �������"
				+ this.getrelease() + "�Դϴ�.";
		return str;
	}

}



