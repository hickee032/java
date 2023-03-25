package sec01_pattern;

import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		String[] data = { "bat", "baby", "bouns", "cA", "ca", "co", "c0", "car", "combat", "count", "data", "disc" };

		Vector<String> vc = new Vector<String>();
		// 아래 패턴을 정의 하였는 데 c로 시작 하는 소문자 영어 단어나 문장을 패턴으로 설정
		Pattern p = Pattern.compile("c[a-z]*");

		System.out.println("c로 시작하는 소문자 영어단어를 출력합니다.");
		for (String str : data) {
			Matcher m = p.matcher(str);

			// 정규표현식과 동일한 지 물어보고 같으면 vector에 저장.
			if (m.matches()) {
				System.out.print(str + ", ");
				vc.add(str);
			}
		}
		System.out.println();
		System.out.println("c로 시작하는 소문자 영단어" + vc.toString());
	}

}
