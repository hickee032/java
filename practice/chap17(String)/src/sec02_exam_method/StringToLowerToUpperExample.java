package sec02_exam_method;

public class StringToLowerToUpperExample {

	public static void main(String[] args) {
		// tolowercase() : 대문자 ---> 소문자
		// touppercase() : 소문자 ---> 대문자

		String str1 = "Java Programming";
		String str2 = "JAVA Programming";

		System.out.println(str1.toLowerCase()); // 소문자
		System.out.println(str2.toUpperCase()); // 대문자

		System.out.println(str1.equals(str2));

		// equalsIgnoreCase()는 대소문자를 구별하지 않고 비교한다.
		System.out.println(str1.equalsIgnoreCase(str2));
	}

}
