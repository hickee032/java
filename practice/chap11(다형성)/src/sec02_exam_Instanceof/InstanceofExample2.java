package sec02_exam_Instanceof;

//���� Ŭ����
class Parent {

}

//�ڼ� Ŭ����
class Child extends Parent {

}

//�ϳ��� �ڹ����� ���� public�� �ϳ��� �־�� �Ѵ�.
public class InstanceofExample2 {

	public static void method1(Parent parent) {

		if (parent instanceof Child) {
			// ���� ��� ���迡 �־ instanceof�� ����� true
			// ���� ĳ���� ����
			Child child = (Child) parent;
			System.out.println("method1 - Child ��ȯ ����");
		} else {
			System.out.println("method1 - Child ��ȯ ����");
		}

	}

	public static void method2(Parent parent) {
		//����ȯ�� �����ϳĶ�� ����� ����ϴ� �����ڰ�  instanceof �̴�.
		if (parent instanceof Child) {
			parent = new Child();
			// Child child = (Child)Parent;
			System.out.println("method1 - Child ��ȯ ����");
		} else {
			System.out.println("method1 - Child ��ȯ ����");
		}

	}

	public static void main(String[] args) {
		// �ʵ��� �������� ����

		Parent parentA = new Child(); // ��ȯ����

		// Parent parentA = new Parent(); //��ȯ����
		method1(parentA);
		method1(new Child());
		method2(parentA);
		
		
		Parent parentB = new Parent();
		method1(parentB);
		method1(new Child());
		method2(parentB);
	}
	

}
