package sec04_exam_Default_StaticMethod_Example;

/*�������̽���  ����Ʈ �޼���� ����ƽ �޼��常�� �����ϱ� ������ ������ �� �ʿ䰡 ����.
�߻�޼��尡 ���� �Ұ�� �ݵ�� ������ �ؾ��Ѵ�.*/

public class Child extends Parent implements MyInterface1 {

	public void childmethod() {
		System.out.println("�ڼ�Ŭ�������� ȣ���� �޼���");
	}
	
	@Override
	public void method1() {
		System.out.println("�ڼ�Ŭ���� ���� MyInterface1 method1 ȣ��(�������̵� )");
		
	}
}
