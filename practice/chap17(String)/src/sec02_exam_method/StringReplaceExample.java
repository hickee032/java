package sec02_exam_method;

public class StringReplaceExample {

	public static void main(String[] args) {

		// replace()�� ���ڿ��� ��ü�ϴ� �޼���

		String str1 = "�ڹٴ� ��ü �������̴�";
		String str2 = str1.replace("��ü", "Object");

		System.out.println(str1);
		System.out.println(str2);
	}

}
