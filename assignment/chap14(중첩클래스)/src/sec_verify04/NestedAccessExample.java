package sec_verify04;

public class NestedAccessExample {

	public static void main(String[] args) {

		Outer outer = new Outer(); //외부 클래스
		Outer.Inner inner = outer.new Inner();

		inner.method1();

	}

}
