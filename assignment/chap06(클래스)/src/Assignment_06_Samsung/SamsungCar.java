package Assignment_06_Samsung;

public class SamsungCar {

	private String company = "삼성자동차";
	private String model = "삼성자동차 모델";
	private String color = "White";
	private int maxSpeed = 240;

//==========================================================

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {

		// 예외처리
		if (company != "SM5") {

			System.out.println("삼성자동차 아닙니다.");

			return;
		}
	}

//==========================================================

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {

		// 예외처리
		if (model != "SM5") {

			System.out.println("삼성자동차 모델이 아닙니다.");

			return;
		}

	}

//==========================================================	

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		if (model != "SM5") {

			System.out.println("삼성자동차 아닙니다.");

			return;
		}
	}

//==========================================================

	public int getmaxSpeed() {
		return this.maxSpeed;
	}

	public void setmaxSpeed(int maxSpeed) {

		if (maxSpeed < 0) {

			System.out.println("속도 음수 무엇?");

			return;
		}

		if (maxSpeed > 0) {

			System.out.print("최고속도는 " + maxSpeed);

			return;
		}

	}

	@Override //Annotation 컴파일러에게 컴파일을 강하게 해라.
	public String toString() {
		String str = this.getCompany() + "의 " + this.getColor() + "색상이며" + this.getModel() + "이고 최고속도는"
				+ this.getmaxSpeed() + "입니다.";
		return str;
	}

}
