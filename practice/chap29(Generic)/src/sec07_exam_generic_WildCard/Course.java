package sec07_exam_generic_WildCard;

//������ ���� �Ҽ� �ִ� ����� ���׸� Ÿ�� T�� ����
//� ����� ���� ���� �ƹ��� �𸣴� ������ .
public class Course<T> {
	private String name; // ������
	private T[] students; // ������ ������ �ִ� ������ ��

	public Course(String name, int size) {
		this.name = name;
		// this.student = new T[size]; //T�� Ÿ���� ������ ���� �ʾƼ� �迭�� ������� ����. ������ �߻��Ѵ�.
		// �� �κ��� ���� ���� ���� �ϵ��� �Ѵ�. �̷� �ڵ尡 ���� �����Ѵ�.
		this.students = (T[]) new Object[size];
	}

	public String getName() {
		return this.name;
	}

	public T[] getStudents() {
		return this.students;
	}

	// ������ �߰����ִ� �޼���
	public void add(T t) {
		for (int i = 0; i < this.students.length; i++) {
			if (students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}
