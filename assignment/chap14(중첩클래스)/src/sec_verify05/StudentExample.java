package sec_verify05;

public class StudentExample {

	public static void main(String[] args) {

		StudentAnonymous f = new StudentAnonymous();

		f.field.wake();

		f.method1();

		f.method2(f.field);

	}

}
