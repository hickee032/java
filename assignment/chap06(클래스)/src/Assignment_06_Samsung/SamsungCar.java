package Assignment_06_Samsung;

public class SamsungCar {

	private String company = "�Ｚ�ڵ���";
	private String model = "�Ｚ�ڵ��� ��";
	private String color = "White";
	private int maxSpeed = 240;

//==========================================================

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {

		// ����ó��
		if (company != "SM5") {

			System.out.println("�Ｚ�ڵ��� �ƴմϴ�.");

			return;
		}
	}

//==========================================================

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {

		// ����ó��
		if (model != "SM5") {

			System.out.println("�Ｚ�ڵ��� ���� �ƴմϴ�.");

			return;
		}

	}

//==========================================================	

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		if (model != "SM5") {

			System.out.println("�Ｚ�ڵ��� �ƴմϴ�.");

			return;
		}
	}

//==========================================================

	public int getmaxSpeed() {
		return this.maxSpeed;
	}

	public void setmaxSpeed(int maxSpeed) {

		if (maxSpeed < 0) {

			System.out.println("�ӵ� ���� ����?");

			return;
		}

		if (maxSpeed > 0) {

			System.out.print("�ְ�ӵ��� " + maxSpeed);

			return;
		}

	}

	@Override //Annotation �����Ϸ����� �������� ���ϰ� �ض�.
	public String toString() {
		String str = this.getCompany() + "�� " + this.getColor() + "�����̸�" + this.getModel() + "�̰� �ְ�ӵ���"
				+ this.getmaxSpeed() + "�Դϴ�.";
		return str;
	}

}
