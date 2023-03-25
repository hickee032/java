package sec02_exam_method;

public class StrinfTrimExample {

	public static void main(String[] args) {
		// trim() 문자열을 기준으로 좌우 (앞뒤) 공백을 제거한다.
		// 하여 문자열 중간에 있는 공백은 프로그래머가 찾아서 제거해주는 코드를 해줘야한다.
		//아이디나 패스워드 입력받을 경우 trim()활용하면 오류를 많이 줄일수 있다.
		String tel1 = "           053";
		String tel2 = "-611          ";
		String tel3 = "-10     38    ";

		System.out.println(tel1.trim() + tel2.trim() + tel3.trim());

	}

}
