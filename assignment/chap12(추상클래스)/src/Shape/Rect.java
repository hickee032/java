package Shape;

//직사각형
public class Rect extends Shape {

	double width; // 가로
	double height; // 세로

	public Rect(double width, double height) {

	}

	public Rect(Point p, double width, double height) {
		// TODO Auto-generated constructor stub
	}

	public boolean isSquare() {

		return false;

	}

	@Override
	double calcArea() {

		return 0;
	}
}
