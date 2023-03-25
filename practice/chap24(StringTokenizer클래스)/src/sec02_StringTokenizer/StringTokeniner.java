package sec02_StringTokenizer;

import java.util.StringTokenizer;

public class StringTokeniner {

	public static void main(String[] args) {
		
		String souece = "1,김천재,100,100,100|2,박수채,95,80,90|3,이자바,80,90,90";
		// 현 삭생의 정보를 구분하기 위해서는 |를 사용
		StringTokenizer st = new StringTokenizer(souece, "|");
		// 더블루프를 도는 이유는 구분자가 크게 2가지로 나뉘어졌기 때문이다
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println("가져온 토큰 : " + token);
			// 가져온 토큰을 다시 또 구분자를 줌
			StringTokenizer st1 = new StringTokenizer(token, ",");
			while (st1.hasMoreTokens()) {
				System.out.println(st1.nextToken());

			}
		}
	}

}