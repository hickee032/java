package sec00_exam_InterfaceExam;

public class PersonExample {

	public static void main(String[] args) {
		
		A a = new Person();				//�������̽��� ���� �ߴ� ��� ���� ������ ������ �ǹ� �Ѵ�. �� �������� ����ȴ�.
		Person p = new Person();		//�������̽��� ���� �ߴ� ��� ���� ������ ������ �ǹ� �Ѵ�. �� �������� ����ȴ�.
		a.method();						
		p.method();

		
		A a1 = new Member();   //��������� ������
		a1.method();
	}

}
