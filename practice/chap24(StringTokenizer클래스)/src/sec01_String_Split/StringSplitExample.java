package sec01_String_Split;

public class StringSplitExample {

	public static void main(String[] args) {
		String text = "홍길동&이수홍,박연수,김자바-최명호/이윤수";

		// split은 구분자를 여러개 (정규 표현식)
		String[] names = text.split("&|,|-|/");

		// 향상된 for문
		for (String name : names)
			System.out.println(name);

	}

}
