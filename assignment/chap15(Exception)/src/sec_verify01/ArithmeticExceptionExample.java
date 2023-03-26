package sec_verify01;

public class ArithmeticExceptionExample {

	public static void main(String[] args) {

		int number = 100;
		int result = 0;

		for (int i = 0; i < 10; i++) {
			try {
				result = number / (int) (Math.random() * 10);
				System.out.println(result);
			} catch (ArithmeticException e) {
				System.out.print("예외 발생 ");
				System.out.println(e.toString());

			}
		}
	}
}
