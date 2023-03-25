package sec02_exam_DrawShape;

public class Triangle extends Shape {// 삼각형은 도형이다.

	Point[] p;

	// 기본생성자
	public Triangle() {
		this(new Point(0, 0), new Point(0, 100), new Point(100, 0));
	}

	//point 클래스 3개 point인스턴스 3개를 받는 매개변수가 있는 생성자
	public Triangle(Point p1, Point p2, Point p3) {
		System.out.println("매개변수 3개 짜리 생성자 호출 ");
		p = new Point[] { p1, p2, p3 };
	}

	// point[]타입의 주소를 받는 생성자
	public Triangle(Point[] p) {
		System.out.println("매개변수 Point[]생성자 호출 ");
		this.p = p;
	}

	@Override
		public void Draw() {
			System.out.println("p1 : " + this.p[0].toString());
			System.out.println("p2 : " + this.p[1].toString());
			System.out.println("p3 : " + this.p[2].toString());
			
		}
}
