package sec02_StringTokenizer;

import java.util.StringTokenizer;

public class SplitVsStringTokenizer {

	public static void main(String[] args) {
		String data = "100    200 300";

		// 아래 둘다 구분자를 공백으로 주었다 (" ")
		// split()은 공백까지 하나의 토큰으로 인식을 한다.
		String[] result = data.split(" ");
		StringTokenizer st = new StringTokenizer(data, " ");

		for (String str : result) {
			System.out.println(str);
		}
		System.out.println("토큰개수 - " + result.length);

		System.out.println("----------------------------");
		// StringTokenizer클래스의 hasMoreTokens()와 nextToken()는 토큰을 가져와서 출력하고 그 개수를 삭제를 한다
		System.out.println("토큰 개수 - " + st.countTokens());

		while (st.hasMoreTokens()) {
			System.out.println("토큰 개수 - " + st.countTokens());
			String str = st.nextToken();
			System.out.println(str);
		}

		/*
		 * 결론은 String클래스, StringTokenizer클래스 둘다 공백을 구분자로 주었음에도 불구하고 결과는 다르다는 것을 알았다. 하여
		 * 두 클래스의 장단점을 알았으니 추후 프로그래밍시에 그 환경에 맞게 선택해서 프로그래밍 하면 된다.
		 */
	}

}
