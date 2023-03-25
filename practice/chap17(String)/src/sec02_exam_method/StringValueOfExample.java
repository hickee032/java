package sec02_exam_method;

public class StringValueOfExample {

	public static void main(String[] args) {
		// String.valueof() 정적메서드로 UI화면이나 진행율 등
		// 수치를 나타내고자 할때 많이 쓰인다.

		String str1 = String.valueOf(true);
		String str2 = String.valueOf(10);
		String str3 = String.valueOf(10.5);

		// str1 의 값은 참 거짓의 boolean타입이 아니라 string타입이라는 것이 중요하다.
		System.out.println(str1);

		System.out.println(str2.equals(str3));
		System.out.println(str3);

	}

}
