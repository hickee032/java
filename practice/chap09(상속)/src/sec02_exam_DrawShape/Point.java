package sec02_exam_DrawShape;

public class Point {

	int x;
	int y;

	public Point() {
		this(0, 0);// �Ű������� �ִ� �Ǵٸ� �����ڸ� Ŭ���������� ȣ��
	}

	// �Ű������� �ִ� ������
	public Point(int x, int y) {
		System.out.println("PointŬ������ �Ű������� �ִ� ������ ȣ��");
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {

		return "(" + this.x + "," + this.y + ")";
	}

}
