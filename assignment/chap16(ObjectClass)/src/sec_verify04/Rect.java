package sec_verify04;

public class Rect {
	private int width;
	private int height;

	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Rect) {
			Rect rect = (Rect) obj;
			if (this.width * this.height == rect.width * rect.height) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		String result = " x : " + this.getWidth() + "�̸�, y : " + this.height + "�̴�";

		return result;
	}
}
