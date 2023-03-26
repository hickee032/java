package sec_verify02;

public class StringMetodExample {

	public static void main(String[] args) {
		String a = new String("    java,");
		String b = new String("program,fighting      ");

		String ab = a.concat(b);
		System.out.println("문자열 a와 문자열 b를 연결한 결과 : " + ab);

		String newa = ab.trim();
		System.out.println("문자열 a의 공백을 제거한 결과 : " + newa);

		String rea = newa.replace("a", "1");
		System.out.println("문자열 a의 a를 1로 대치한 결과 : " + rea);

		String[] arr = rea.split(",");

		for (int i = 0; i < arr.length; i++) {
			System.out.println("분리된 " + i + "번 문자열: " + arr[i]);
		}

		String subs = rea.substring(3);
		System.out.println("문자열 a의 substring한 결과  : " + subs);
		char c = subs.charAt(2);
		System.out.println("문자열 a의 2번째 문자를 char c에 대입한 결과 : " + c);
	}

}
