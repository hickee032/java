package sec02_exam_DrawShape;

public class Triangle extends Shape {// �ﰢ���� �����̴�.

	Point[] p;

	// �⺻������
	public Triangle() {
		this(new Point(0, 0), new Point(0, 100), new Point(100, 0));
	}

	//point Ŭ���� 3�� point�ν��Ͻ� 3���� �޴� �Ű������� �ִ� ������
	public Triangle(Point p1, Point p2, Point p3) {
		System.out.println("�Ű����� 3�� ¥�� ������ ȣ�� ");
		p = new Point[] { p1, p2, p3 };
	}

	// point[]Ÿ���� �ּҸ� �޴� ������
	public Triangle(Point[] p) {
		System.out.println("�Ű����� Point[]������ ȣ�� ");
		this.p = p;
	}

	@Override
		public void Draw() {
			System.out.println("p1 : " + this.p[0].toString());
			System.out.println("p2 : " + this.p[1].toString());
			System.out.println("p3 : " + this.p[2].toString());
			
		}
}
