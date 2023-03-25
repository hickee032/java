package sec01_exam_runtime_exception;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "100a";

		int value1 = Integer.parseInt(data1);
		System.out.println(value1);

		// 시도해라 시도하다가 예외가 생기면 예외가 생긴 부분부터 실행 하지말고 catch로 가라~~ 그리고 프로그램 종료
		try {
			int value2 = Integer.parseInt(data2);
			System.out.println(value2);
		} catch (NumberFormatException e) {
			System.out.println("예외발생" + e.toString());

			// 개발자용 - 릴리즈시 주석 처리
			e.printStackTrace();
		}
		// 예외가 터지던 안 터지던 상관없이 실행된다. - 항상 실행된다.
		finally {
			System.out.println("정상 프로그램 종료");

		}
	}

}
