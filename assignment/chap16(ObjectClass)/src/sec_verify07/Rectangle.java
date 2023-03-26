package sec_verify07;

public class Rectangle implements Cloneable {

	Point upperLeft;
	Point lowerRight;

	public Rectangle(int a, int b, int c, int d) {
		this.upperLeft = new Point(a, b);
		this.lowerRight = new Point(c, d);

	}

	public void changePos(int a, int b, int c, int d) {
		this.upperLeft.changePos(a, b);
		this.lowerRight.changePos(c, d);
	}

	public void showPosition() {
		System.out.println("[ ���簢�� ��ġ ���� ]");
		System.out.print("�� ��� :");
		upperLeft.showPosition();
		System.out.print("�� �ϴ� :");
		lowerRight.showPosition();

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		Rectangle cloned = (Rectangle) super.clone();

		cloned.upperLeft = (Point) upperLeft.clone();
		cloned.lowerRight = (Point) lowerRight.clone();

		return cloned;
	}

}