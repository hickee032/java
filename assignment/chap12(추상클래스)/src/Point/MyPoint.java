package Point;

//조상 클래스 & 추상 클래스
public abstract class MyPoint {

	int x;
	int y;

	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// 추상메서드
	protected abstract void move(int x, int y);

	// 추상메서드
	protected abstract void reverse();

	// 출력메서드
	protected void show() {

		System.out.print("현재 x, y의 값 : " + this.x + "," + this.y + ",");
	}

}
