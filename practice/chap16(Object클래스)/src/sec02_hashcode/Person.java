package sec02_hashcode;

//hashcode �޸� �ּҸ� ���������� ��Ÿ����.
public class Person {

	int number;

	public Person(int number) {
		this.number = number;
	}

	// 1���� ���� ������ ���ؼ��� �Ʒ��� ���� hashcode()�� �������̵� �ؾ��Ѵ�.
	// �Ʒ��� ���� hash�ø�� ����� ���� �������� ���ؼ��� ���� �ϴ� ���� ���ƾ����� ���ü�� �����Ѵ�.

	@Override
	public int hashCode() {
		System.out.println("hashcode() ȣ��");
		return this.number;
	}

	// 2������ equals()�� ȣ���ؼ� ���񱳸� �ؼ� ������ ���� �������� ����
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals() ȣ��");
		if (obj instanceof Person) {
			Person key = (Person) obj;
			if (this.number == key.number) {
				return true;
			}
		}
		return false;
	}
}
