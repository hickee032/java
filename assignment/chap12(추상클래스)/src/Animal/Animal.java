package Animal;

//����Ŭ����-�߻�Ŭ����
public abstract class Animal {

	String kind; // ����

	public void breathe() {
		System.out.println("������ ���� ���ϴ�.");
	}

	abstract void sound();

}
