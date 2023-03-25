package sec01_pattern;

import java.util.regex.Pattern;

public class PatternExample03 {

	public static void main(String[] args) {
		
		//010으로 시작하는 폰 번호 패턴
		String regExp = "(010)-\\d{3,4}-\\d{4}";
		
		String data = "010-9903-2723";
		
		//Pattern.matches()으로 패턴에 일치하는 지 확인.
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("전화 번호 양식이 맞습니다.");
		}
		else {
			System.out.println("다시 입력");
		}
		
		//아래는 이메일 패턴을 정의한것이다.
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "aaa@naver.com";
		result = Pattern.matches(regExp, data);
		
		if(result) {
			System.out.println("이메일 양식이 맞습니다.");
		}
		else {
			System.out.println("다시 입력");
		}
		

	}

}
