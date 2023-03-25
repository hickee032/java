package sec02_exam_method;

public class StringsubStringExample {

	public static void main(String[] args) {

		// subString 문자열을 잘라내는 메서드
		String ssn = "880815-1234567";

		// subString 아래와 같이 오버로딩이 되어있다.
		System.out.println(ssn.substring(7));
		// subString(a,b) 처음인덱스는 포함하지만 마지막 인덱스는 포함 하지 않는 다.
		System.out.println(ssn.substring(0, 6));

	}

}
