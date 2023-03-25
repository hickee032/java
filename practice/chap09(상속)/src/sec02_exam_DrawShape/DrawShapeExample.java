package sec02_exam_DrawShape;

public class DrawShapeExample {

	public static void main(String[] args) {

		Circle c = new Circle();
		c.Draw();

		Triangle t = new Triangle();
		t.Draw();

		Point[] p = new Point[] { new Point(10, 10), new Point(20, 30), new Point(30, 20) };
		
		Triangle t1 = new Triangle(p);
		
		t1.Draw();
	}

}
