package sec07_exam_generic_WildCard;

//과정을 수강 할수 있는 대상을 제네릭 타입 T로 선언
//어떤 대상이 수강 할지 아무도 모르는 상태임 .
public class Course<T> {
	private String name; // 과정명
	private T[] students; // 과정을 들을수 있는 수강생 수

	public Course(String name, int size) {
		this.name = name;
		// this.student = new T[size]; //T의 타입이 정해져 있지 않아서 배열을 만들수가 없다. 오류가 발생한다.
		// 이 부분은 필히 보고 숙지 하도록 한다. 이런 코드가 종종 등장한다.
		this.students = (T[]) new Object[size];
	}

	public String getName() {
		return this.name;
	}

	public T[] getStudents() {
		return this.students;
	}

	// 수강생 추가해주는 메서드
	public void add(T t) {
		for (int i = 0; i < this.students.length; i++) {
			if (students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}
