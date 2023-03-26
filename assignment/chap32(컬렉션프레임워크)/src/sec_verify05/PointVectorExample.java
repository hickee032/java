package sec_verify05;

import java.util.Vector;

public class PointVectorExample {

	public static void main(String[] args) {
		Vector<Point> vi = new Vector<Point>();
		vi.add(new Point(2, 3));
		vi.add(new Point(-5, 20));
		vi.add(new Point(30, -8));
		
		for (int i = 0; i < vi.size(); i++) {
			System.out.println(vi.get(i).toString());
		}

	}

}
