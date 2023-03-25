package sec04_exam_generic_method_2;

public class Apple {

	private int key;

	public Apple(int key) {
		this.key = key;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	@Override
	public String toString() {

		return this.key + "";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Apple) {
			Apple apple = (Apple) obj;
			if (apple.key == this.key) {
				return true;
			}
		}
		return false;

	}
}
