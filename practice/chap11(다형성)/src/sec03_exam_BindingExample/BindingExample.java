package sec03_exam_BindingExample;

public class BindingExample {

	public static void main(String[] args) {

		Parent p = new Parent(); // �������� ����� �ڵ�
		Child c = new Child(); // �������� ������ �ڵ�

		/*
		 * ��������� �� �ν��Ͻ��� ���� �����. 
		 * ��� �޼����� ��� �������̵��� �ڼ� Ŭ������ �޼��带 �Ѵ� ȣ���Կ� �������� . 
		 * ���� �ڼ� Ŭ�������� �ƹ��͵� ���ǵ��� �ʾҴٸ� ���� Ŭ������ ��������� ����޼��尡 �������� ȣ���
		 */

		System.out.println("p.x = " + p.x);
		p.method();

		System.out.println("c.x = " + c.x);
		c.method();
	}

}
