package sec05_exam_InterfaceExample_Direct;

public class InterfaceExample {

	public static void main(String[] args) {
		
		//Ŭ���� B�� �� �ϼ� �Ǿ�� ��μ� Ŭ���� A�� �޼���A�� ȣ���Ҽ��ִ�.

		A a = new A();
		B b = new B();
		
		a.methodA(new B());
		a.methodA(b);
	}

}
