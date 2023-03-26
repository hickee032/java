package sec_verify05;

import java.util.StringTokenizer;

public class SplitExample {

	public static void main(String[] args) {
		String str = "���̵�,�̸�,�н�����";
		String[] arr = str.split(",");
		
		System.out.println("String�� split()�� �̿��� ���"); 
		for (String sp : arr) {	
			System.out.println(sp);
		}
		System.out.println();
		System.out.println("StringTokenizer�� �̿��� ���");
		StringTokenizer st = new StringTokenizer(str, ",");
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
			
			
		}
		

	}

}
