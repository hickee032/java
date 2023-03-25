package sec02_exam_method;

public class StringIndexOfExample {

	public static void main(String[] args) {
		// IndexOf는 찾기 기능을 할때 자주 쓰인다.(사전,문서 등)

		String str = "오늘은 자바 공부 하기가 좋은 날이네";

		// 문자를 찾으면 문자의 인덱스를 리턴한다.
		int index = str.indexOf("공부");

		System.out.println("공부의 시작 방번호 : " + index);

		// 공부라는 문자열이 포함되어있으면.
		if (str.indexOf("공부") != -1) {
			System.out.println("공부와 관련이 있군요");
		} else {
			System.out.println("공부와 관련이 없군요");
		}
	}

}
