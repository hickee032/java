package sec_verify04;

public class NestedAccessExample {

	public static void main(String[] args) {

		Outer outer = new Outer(); //�ܺ� Ŭ����
		Outer.Inner inner = outer.new Inner();

		inner.method1();

	}

}
