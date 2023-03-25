package sec03_exam_Nested_Class_and_Method_Access;

public class A {

	class B {
	}

	static class C {
	}

	B field1 = new B();
	C field2 = new C();

	void method1() {
		// ��������
		B var1 = new B();
		C var2 = new C();
	}

	/*
	 * ���� �ʵ� BŬ������ �ν��Ͻ� ���Ŭ���� �̹Ƿ� �ٱ� �ܺ� Ŭ������A�� ���� �Ǿ߸� ����Ҽ��ִ�.
	 * 
	 * �׷��Ƿ� static�� ���ϼ��� ����.
	 */

	static B field3 = new B(); //B�� �ν��Ͻ� ����̱� ������ ���Ұ�.
	// CŬ������ static �̶� �����ϴ�.
	static C field4 = new C();

	static void method2() {
		// static ���̴ϱ� static�Ӽ��� ����� �ϰ�
		// B�� �ܺ� Ŭ������ �����Ǿ��Ѵ�. �ν��Ͻ� ��� Ŭ�����̴�.
		B var3 = new B(); 
		C var4 = new C();
	}
//	��ø Ŭ������ �ν��Ͻ� �ʵ峪 �޼���� �������� �������������� �����ʵ峪 �޼���� ���� Ŭ������ ���������ϴ�.
}
