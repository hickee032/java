package sec06_exam_InterfaceExample_inDirect;

public class InterfaceExample {

	public static void main(String[] args) {
		
		//Ŭ���� B�� �� �ϼ� �Ǿ�� ��μ� Ŭ���� A�� �޼���A�� ȣ���Ҽ��ִ�.

		//Ŭ������ ���������Ͽ� ȣ��
		A a = new A();
		a.methodA(new B());
		
		//�������̽� �ʵ��� ������
		I i = new B();
		i.methodB();
	}

}
