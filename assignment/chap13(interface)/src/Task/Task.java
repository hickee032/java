package Task;

public class Task implements Priority {

	String taskName; // 일의 이름
	int time; // 소요 시간
	int priority_number;// 우선순위

	public Task(String taskName, int time) {
		System.out.print(taskName + "\t" + time + "분     \t    ");
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
