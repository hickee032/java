package Assignment07_Phone;

public class SamsungHandPhone {
	
	private String company = "Samsung";
	private String model = "Samsung폰 모델";
	private String color = "White";
	private int release = 2013;

//==========================================================

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {

		// 예외처리
		if (company != "Samsung") {

			System.out.println("Samsung폰이 아닙니다.");

			return;
		}
	}

//==========================================================

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {

		// 예외처리
		if ((model != "Galaxy3")||(model != "Galaxy4")||(model != "Galaxy5")
				||(model != "Galaxy6")||(model != "Galaxy7")||(model != "GalaxyNote)")) {

			System.out.println("Samsung폰 모델이 아닙니다.");

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

			System.out.println("년도 음수 무엇?");

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

	@Override //Annotation 컴파일러에게 컴파일을 강하게 해라.
	public String toString() {
		String str = this.getCompany() + "의 " + this.getColor() + "색상이며" + this.getModel() + "이고 출시일은"
				+ this.getrelease() + "입니다.";
		return str;
	}

}



