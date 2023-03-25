package sec01_exam;

public class StringEx {

	public static void main(String[] args) {
		// String클래스의 참조변수 name, str
		String name = new String("Ja" + "va");
		String str = new String(name + 8.0);

		// 애니타입 + 문자열 = 문자열

		System.out.println(name);
		System.out.println(str);
		System.out.println(7 + " "); // +는 각각을 문자열화 하여 연결해준다.
		System.out.println(" " + 7);

		// 1234567은 데이터 타입이 무엇인가요?
		System.out.println(1234567);
	}
}
