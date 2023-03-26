package sec_verify04;

public class Outer {

	int OuterValue = 10;

	class Inner {

		int InnerValue = 20;

		void method1() {
			int method1Value = 30;

			System.out.println("method1의 value값 : " + method1Value);
			System.out.println("Inner클래스의 value값 : " + Outer.Inner.this.InnerValue);
			System.out.println("Outer클래스의 value값 : " + Outer.this.OuterValue);

		}
	}

}
