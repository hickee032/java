package sec03_Multi_Catch;

public class MultiCatchExample {

	public static void main(String[] args) {
		try {
			// 무슨 예외가 발생할수있나.?
			String data1 = args[0];
			String data2 = args[1];

			// 무슨 예외가 발생할수있나.?
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);

			int result = value1 + value2;

			System.out.println("result :" + result);
			// 멀티 캐치
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("실행 매개값이 없거나 숫자로 변환이 불가 합니다.");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("알수없는 예외가 발생함");
			e.printStackTrace();
		} finally {
			System.out.println("프로그램 정상 종료");
		}

	}

}
