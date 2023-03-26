package sec_verify04;

import java.util.StringTokenizer;

public class MainArgumentExample {

	public static void main(String[] args) {
		String str = "나는=김지훈&ID=perpear&국어점수=90&수학점수=98&자바점수=100";
		StringTokenizer st = new StringTokenizer(str, "&");
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token.replace('=', ' '));
		}
	}
}
