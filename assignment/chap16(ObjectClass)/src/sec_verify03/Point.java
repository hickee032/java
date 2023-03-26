package sec_verify03;

public class Point {

	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			Point point = (Point) obj;
			if ((this.x == point.x) && (this.y == point.y)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
	String result = "x : " + this.getX() + "이며, y : " + this.getY() + "이다";
		return result;
	}

}
