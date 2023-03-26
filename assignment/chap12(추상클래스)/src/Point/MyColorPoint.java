package Point;

//자손 클래스
public class MyColorPoint extends MyPoint {

	String color;

	public MyColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	@Override
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;

	}

	@Override
	protected void reverse() {
		System.out.println("x와 y의 값을 바꿨습니다");

	}

	@Override
	protected void show() {
		super.show();
		System.out.println(this.color);
		this.reverse();
		System.out.print("현재 x, y의 값 : " + this.y + "," + this.x + ","+this.color);

	}
}
