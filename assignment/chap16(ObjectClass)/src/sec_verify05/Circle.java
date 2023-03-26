package sec_verify05;

public class Circle {

	private int x;
	private int y;
	private int radius;

	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public boolean equals(Circle c) {
		if (c instanceof Circle) {
			Circle circle = c;
			if (this.radius == circle.radius) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		String str = "( " + this.x + this.y + " )" + "������ - " + this.radius;
		return str;
	}

}
