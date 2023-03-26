package ColorPoint03;

public class ColorPoint extends Point {

	String color;

	public void setcolor(String color) {

		this.color = color;

	}

	public void showColorPoint(String color) {

		// super.set(x, y);

		System.out.print("색상이 " + this.color + " 점의 ");

		super.showpoint();

	}

	public ColorPoint() {

		// this.showColorPoint(color);

		// super.showpoint();

	}

}
