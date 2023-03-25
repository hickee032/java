package sec07_exam_generic_WildCard;

import java.lang.ProcessBuilder.Redirect;
import java.util.Arrays;

public class WideCardExample {
	// Course<T> -->? 어떤한 객체라도 상관 없다.
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + "수강생 : " + Arrays.toString(course.getStudents()));
	}

	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + "수강생 : " + Arrays.toString(course.getStudents()));
	}

	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + "수강생 : " + Arrays.toString(course.getStudents()));
	}

	public static void main(String[] args) {

		registerCourse(new Course<Person>("일반인 과정", 5));
		registerCourse(new Course<Student>("학생 과정", 5));
		registerCourse(new Course<HighStudent>("고등학생 과정", 7));
		registerCourse(new Course<Worker>("근로자 과정", 5));

		System.out.println();

		registerCourseStudent(new Course<Student>("학생 과정", 5));
		registerCourseStudent(new Course<HighStudent>("고등학생 과정", 5));
		// registerCourseStudent(new Course<Worker>("근로자 과정",5));
		// registerCourseStudent(new Course<Person>("일반인 과정",5));

		System.out.println();

		registerCourseWorker(new Course<Worker>("근로자 과정", 5));
		registerCourseWorker(new Course<Person>("일반인 과정", 5));
		// registerCourseWorker(new Course<Student>("학생 과정", 5));
		// registerCourseWorker(new Course<HighStudent>("고등학생 과정", 5));

		// 2.직접 Course를 생성하여 확인하는 과정
		Course<Person> personCourse = new Course<Person>("일반인 과정", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Person("직장인"));
		personCourse.add(new Person("학생"));
		personCourse.add(new Person("고등학생"));

		Course<Worker> workerCourse = new Course<Worker>("직장인 과정", 2);
		workerCourse.add(new Worker("홍길동"));
		workerCourse.add(new Worker("박지성"));

		Course<Student> studentCourse = new Course<Student>("학생과정", 4);
		studentCourse.add(new Student("송"));
		studentCourse.add(new Student("민"));
		studentCourse.add(new Student("섭"));
		studentCourse.add(new Student("군"));

		Course<HighStudent> hicourse = new Course<HighStudent>("고등학생 과정", 4);
		hicourse.add(new HighStudent("고"));
		hicourse.add(new HighStudent("등"));
		hicourse.add(new HighStudent("학"));
		hicourse.add(new HighStudent("생"));

		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(hicourse);

		// 익상 수하 - extend를 했기 때문에 student 자기 자신을 포함 한 자손 클래스만 올수있다.
		registerCourseStudent(studentCourse);
		registerCourseStudent(hicourse);

		// 익상 수하 - super를 했기 때문에 whorker 자기 자신을 포함 한 조상 클래스만 올수있다.
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);

		// registerCourseStudent(personCourse);
		// registerCourseStudent(workerCourse);

	}

}
