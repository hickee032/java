package sec06_Throws;

public class ThrowsExample03 {

	public static void main(String[] args) {

		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 없습니다.");
			e.printStackTrace();
		}

		catch (Exception e) {
			System.out.println("알수 없는 예외가 발생했습니다.");
			e.printStackTrace();
		}

	}

	public static void findClass() throws ClassNotFoundException {
		// .forName() 정적메서드는 일반 예외를 발생시킨다.-->ClassNotFoundException
		Class c = Class.forName("java.lang.String2");
	}
}
