package sec00_exam_InterfaceExam;

public class Example {

	public static void main(String[] args) {

		//���� ���� �����ؼ� ���� �ҷ��°�.
		Member m = new Member();
		m.method();
		
		//A���� ���̽��� ���� �޼��� ȣ��
		//���� Ŭ������ ������ �����̴�.
		A a = new Member();
		a.method();
		
//		a�� �ٺ��� A��� �������̽��̴�. ������ �������̽�A���� method1() �������� X
//		�ٺ��� ����� ���Ѵ�.
		//a.method1(); -- ȣ�� �Ҽ� ����.
		

	}

}
