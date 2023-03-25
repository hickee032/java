package sec06_Throws;

public class ThrowsExample02 {

	public static void main(String[] args) {

		try {
			method1();
		} catch (Exception e) {
			System.out.println("메인에서 예외 처리");
			e.printStackTrace();
		}

	} // main()끝

	// method1 예외 떠넘기기하는 중
	public static void method1() throws Exception {
		throw new Exception("예외 발생");
	}
}
