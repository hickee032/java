package sec04_exam_Default_StaticMethod_Example;

public class default_staticExample {

	public static void main(String[] args) {
		
		Child c= new Child();
		c.childmethod();
		c.parentmethod2();
		c.method1(); //�������̵� �� �༮�� ȣ�� �Ѵ�.
		
		c.method2();
		
		//MyInterface1�� �ִ� ���� �޼��� ȣ�� ���
		//�������̽���.�����޼��� ��
		MyInterface1.staticmethod2();
		
		

	}

}
