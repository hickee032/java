package Monitor;

public class Monitor {

	String company;
	int inch;
	int price;

	public Monitor() {
		this("LG", 23, 500000);
	}// 기본 생성자

	public Monitor(String company, int inch, int price) {
		this.company = company;
		this.inch = inch;
		this.price = price;

	}

	@Override
	public String toString() {
		String str = "제조사 : " + this.company + "이며, " + this.inch + "인치이며, 가격은 " + this.price + "입니다.";

		return str;
	}
}
