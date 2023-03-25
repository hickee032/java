package sec02_exam_method;

public class StringReplaceExample {

	public static void main(String[] args) {

		// replace()는 문자열을 대체하는 메서드

		String str1 = "자바는 객체 지향언어이다";
		String str2 = str1.replace("객체", "Object");

		System.out.println(str1);
		System.out.println(str2);
	}

}
