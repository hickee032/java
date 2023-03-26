package sec_verify07;

public class Point implements Cloneable {

	int xPos;

	int yPos;

	public Point(int xPos, int yPos) {

		this.xPos = xPos;

		this.yPos = yPos;

	}

	public void changePos(int xPos, int yPos) {

		this.xPos = xPos;

		this.yPos = yPos;

	}

	public void showPosition() {

		System.out.println("[ " + this.xPos + " , " + this.yPos + " ]");

	}

//thin clone

	public Object clone() {

		Point cloned = null;

		try {

			cloned = (Point) super.clone();

		} catch (CloneNotSupportedException e) {

			e.printStackTrace();

		}

		return cloned;

	}

}
