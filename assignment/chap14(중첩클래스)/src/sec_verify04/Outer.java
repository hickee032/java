package sec_verify04;

public class Outer {

	int OuterValue = 10;

	class Inner {

		int InnerValue = 20;

		void method1() {
			int method1Value = 30;

			System.out.println("method1�� value�� : " + method1Value);
			System.out.println("InnerŬ������ value�� : " + Outer.Inner.this.InnerValue);
			System.out.println("OuterŬ������ value�� : " + Outer.this.OuterValue);

		}
	}

}
