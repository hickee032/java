package sec02_try_catch_finally;

public class TryCatchFinallyExample01 {

	public static void main(String[] args) {
		/*
		 * Class클래스는 문자열을 가지고 클래스로 만들어서 반환 
		 * (인스턴스를 사용할수 있지만 반환된 인스턴스의 정보만을 알뿐) 
		 * 하지만 문자열에 해당하는 클래스가 없다면 일반예외가 발생한다. 
		 * 그래서 컴파일이 되지 않는다. 예외처리가 필수다
		 */
		try {
			
			Class clazz1 = Class.forName("java.lang.String2");  //JSP, DB연동
			//Class clazz = Class.forName("java.lang.String");
			System.out.println("클래스를 찾았습니다.");
			System.out.println(clazz1.getName());
			System.out.println(clazz1.getSimpleName());
			
		
			
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 없습니다.");
		}
		catch (Exception e) {
			System.out.println("예외 발생함");
		}
		finally {
			System.out.println("프로그램을 안전하게 종료");
		}

	}

}
