package sec02_try_catch_finally;

public class TryCatchExample01 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);

		try {
			System.out.println(3);
			System.out.println(1 / 0); // 예외 발생
			System.out.println(-10); // 예외 발생 시 실행하지 않는 다.

		} catch (Exception e) {
			System.out.println(4);
			e.printStackTrace();
		}
		// try문으로 감싸지 않았기 때문에 뜨게된다.
		System.out.println(5);

	}

}
