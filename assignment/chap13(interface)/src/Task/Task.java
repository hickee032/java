package Task;

public class Task implements Priority {

	String taskName; // ���� �̸�
	int time; // �ҿ� �ð�
	int priority_number;// �켱����

	public Task(String taskName, int time) {
		System.out.print(taskName + "\t" + time + "��     \t    ");
	}

	@Override
	public int getPriority() {
			System.out.println(priority_number);
		return priority_number;
	}

	@Override
	public void setPriority(int p) {
		this.priority_number = p;

	}
}
