package ColorPoint03;

public class ColorPoint extends Point {

	String color;

	public void setcolor(String color) {

		this.color = color;

	}

	public void showColorPoint(String color) {

		// super.set(x, y);

		System.out.print("������ " + this.color + " ���� ");

		super.showpoint();

	}

	public ColorPoint() {

		// this.showColorPoint(color);

		// super.showpoint();

	}

}
