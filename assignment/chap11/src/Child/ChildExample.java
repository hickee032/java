package Child;

public class ChildExample {

	public static void main(String[] args) {

		Parent p = new Child();
		Child c = new Child();

		p.method1();
		p.method2();
		c.method3();

	}

}
