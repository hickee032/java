package sec02_exam_SuperExample;

public class Child extends Parent {

	int x = 100;

	void method() {
		
		System.out.println("���� �ν��Ͻ��� x=" + x);
		System.out.println("�ڼ� Ŭ���� this.x=" + this.x);
		System.out.println("���� Ŭ���� super.x=" + super.x);
	}

	@Override
	public String toString() {
		return "�޷�";
	}
}
