package Shape;

public abstract class Shape {
	Point p;

	public Shape() {
		this.p = new Point();
	}

	public Shape(Point p) {

	}

	abstract double calcArea();

	// getter, setter
	public Point getPosition() {
		return p;
	}

	public void setPosition(Point p) {
		this.p = p;
	}

}
