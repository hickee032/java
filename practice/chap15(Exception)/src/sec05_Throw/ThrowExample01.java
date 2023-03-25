package sec05_Throw;

public class ThrowExample01 {

	public static void main(String[] args) {
		try {
			// 강제로 예외를 발생시키는 코드
			throw new Exception("고의로 발생시킴");
			// System.out.println("~~~~~~~~"); //결코 도달할수 없는 코드 - 예외발생

		} catch (Exception e) {
			System.out.println("예외 메세지 출력" + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("정상 종료");
	}

}
