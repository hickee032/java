package Point;

//�ڼ� Ŭ����
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
		System.out.println("x�� y�� ���� �ٲ���ϴ�");

	}

	@Override
	protected void show() {
		super.show();
		System.out.println(this.color);
		this.reverse();
		System.out.print("���� x, y�� �� : " + this.y + "," + this.x + ","+this.color);

	}
}
