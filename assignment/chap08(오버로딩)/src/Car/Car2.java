package Car;

public class Car2 {

	String company = "현대자동차";

	String model;

	String color;

	int maxSpeed;

	public Car2() {
		System.out.println(company);
	}
	
	public Car2(String model) {

		this.model = model;
		
	}

	public Car2(String model, String color) {

		this.model = model;

		this.color = color;

	}

	public Car2(String model, String color, int maxSpeed) {

		this.model = model;

		this.color = color;

		this.maxSpeed = maxSpeed;

	}

	@Override

	public String toString() {

		String str = this.company + "\n" + this.model + "\n" + this.color + "\n" + this.maxSpeed;

		return str;

	}

}
