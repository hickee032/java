package sec04_exam_Default_StaticMethod_Example;

public interface MyInterface1 {
	//����Ʈ�޼���� �ۺ��� ���� �Ǿ��ִ�.
	//�� �����ΰ� �����Ѵ�.
	default void method1() {
		System.out.println("�������̽�1 ����Ʈ �޼��� 1 ȣ��");
	}
	
	default void method2() {
		System.out.println("�������̽�1 ����Ʈ �޼��� 2 ȣ��");
	}
	
	//�����޼���
	static void  staticmethod2() {
		System.out.println("�������̽�1 ����(static) �޼���  ȣ��");
	}

}
