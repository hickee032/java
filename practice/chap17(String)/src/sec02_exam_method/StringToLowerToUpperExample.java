package sec02_exam_method;

public class StringToLowerToUpperExample {

	public static void main(String[] args) {
		// tolowercase() : �빮�� ---> �ҹ���
		// touppercase() : �ҹ��� ---> �빮��

		String str1 = "Java Programming";
		String str2 = "JAVA Programming";

		System.out.println(str1.toLowerCase()); // �ҹ���
		System.out.println(str2.toUpperCase()); // �빮��

		System.out.println(str1.equals(str2));

		// equalsIgnoreCase()�� ��ҹ��ڸ� �������� �ʰ� ���Ѵ�.
		System.out.println(str1.equalsIgnoreCase(str2));
	}

}
