package sec07_exam_generic_WildCard;

import java.lang.ProcessBuilder.Redirect;
import java.util.Arrays;

public class WideCardExample {
	// Course<T> -->? ��� ��ü�� ��� ����.
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + "������ : " + Arrays.toString(course.getStudents()));
	}

	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + "������ : " + Arrays.toString(course.getStudents()));
	}

	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + "������ : " + Arrays.toString(course.getStudents()));
	}

	public static void main(String[] args) {

		registerCourse(new Course<Person>("�Ϲ��� ����", 5));
		registerCourse(new Course<Student>("�л� ����", 5));
		registerCourse(new Course<HighStudent>("����л� ����", 7));
		registerCourse(new Course<Worker>("�ٷ��� ����", 5));

		System.out.println();

		registerCourseStudent(new Course<Student>("�л� ����", 5));
		registerCourseStudent(new Course<HighStudent>("����л� ����", 5));
		// registerCourseStudent(new Course<Worker>("�ٷ��� ����",5));
		// registerCourseStudent(new Course<Person>("�Ϲ��� ����",5));

		System.out.println();

		registerCourseWorker(new Course<Worker>("�ٷ��� ����", 5));
		registerCourseWorker(new Course<Person>("�Ϲ��� ����", 5));
		// registerCourseWorker(new Course<Student>("�л� ����", 5));
		// registerCourseWorker(new Course<HighStudent>("����л� ����", 5));

		// 2.���� Course�� �����Ͽ� Ȯ���ϴ� ����
		Course<Person> personCourse = new Course<Person>("�Ϲ��� ����", 5);
		personCourse.add(new Person("�Ϲ���"));
		personCourse.add(new Person("������"));
		personCourse.add(new Person("�л�"));
		personCourse.add(new Person("����л�"));

		Course<Worker> workerCourse = new Course<Worker>("������ ����", 2);
		workerCourse.add(new Worker("ȫ�浿"));
		workerCourse.add(new Worker("������"));

		Course<Student> studentCourse = new Course<Student>("�л�����", 4);
		studentCourse.add(new Student("��"));
		studentCourse.add(new Student("��"));
		studentCourse.add(new Student("��"));
		studentCourse.add(new Student("��"));

		Course<HighStudent> hicourse = new Course<HighStudent>("����л� ����", 4);
		hicourse.add(new HighStudent("��"));
		hicourse.add(new HighStudent("��"));
		hicourse.add(new HighStudent("��"));
		hicourse.add(new HighStudent("��"));

		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(hicourse);

		// �ͻ� ���� - extend�� �߱� ������ student �ڱ� �ڽ��� ���� �� �ڼ� Ŭ������ �ü��ִ�.
		registerCourseStudent(studentCourse);
		registerCourseStudent(hicourse);

		// �ͻ� ���� - super�� �߱� ������ whorker �ڱ� �ڽ��� ���� �� ���� Ŭ������ �ü��ִ�.
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);

		// registerCourseStudent(personCourse);
		// registerCourseStudent(workerCourse);

	}

}
