package sec_verify04;

import java.util.StringTokenizer;

public class MainArgumentExample {

	public static void main(String[] args) {
		String str = "����=������&ID=perpear&��������=90&��������=98&�ڹ�����=100";
		StringTokenizer st = new StringTokenizer(str, "&");
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token.replace('=', ' '));
		}
	}
}
