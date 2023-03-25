package sec06_Throws;

public class ThrowsExample01 {

	public static void main(String[] args) {
		method1(); /*
					 * 이렇게 메인 메서드 안에서 다른 메서드인 메서드1을 호출했을 때 
					 * 예외를 떠넘기고 있기 때문에 메인에는 반드시 예외 처리 코드가
					 * 들어가야한다.
					 */
		
	//	1.main() 옆에 throws Exception 붙인다.
	//	2.try catch문으로 직접 예외 처리를 한다.
	}

	public static void method1() throws Exception {
		method2();

	}

	public static void method2() throws Exception {
		throw new Exception("예외 발생");

	}
}
