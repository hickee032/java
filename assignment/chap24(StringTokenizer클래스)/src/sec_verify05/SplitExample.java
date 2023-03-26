package sec_verify05;

import java.util.StringTokenizer;

public class SplitExample {

	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		String[] arr = str.split(",");
		
		System.out.println("String의 split()를 이용한 방법"); 
		for (String sp : arr) {	
			System.out.println(sp);
		}
		System.out.println();
		System.out.println("StringTokenizer를 이용한 방법");
		StringTokenizer st = new StringTokenizer(str, ",");
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
			
			
		}
		

	}

}
