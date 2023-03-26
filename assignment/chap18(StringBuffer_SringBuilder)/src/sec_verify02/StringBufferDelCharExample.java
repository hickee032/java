package sec_verify02;

public class StringBufferDelCharExample {

	static String delChar(String src, String delCh) {

		StringBuffer sb = new StringBuffer(src);

		for (int i = 0; i < src.length(); i++) {
			char del = src.charAt(i);
			if (delCh.indexOf(del) == -1) {
				sb.append(del);
			}

		}
		String result = sb.toString();
		return result;
	}

	public static void main(String[] args) {

		System.out.println("(����!�ڹٸ�@���^^�մϴ�.)" + " -> " + delChar("(����! �ڹٸ�@ ���^^�մϴ�.)", "(!@^)"));
		System.out.println("(1 2 3 4\t5)" + " -> " + delChar("(1 2 3 4\t5)", " \t"));
	}

}
