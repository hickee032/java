package Monitor;

public class Monitor {

	String company;
	int inch;
	int price;

	public Monitor() {
		this("LG", 23, 500000);
	}// �⺻ ������

	public Monitor(String company, int inch, int price) {
		this.company = company;
		this.inch = inch;
		this.price = price;

	}

	@Override
	public String toString() {
		String str = "������ : " + this.company + "�̸�, " + this.inch + "��ġ�̸�, ������ " + this.price + "�Դϴ�.";

		return str;
	}
}
