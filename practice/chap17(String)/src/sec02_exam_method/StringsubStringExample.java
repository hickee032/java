package sec02_exam_method;

public class StringsubStringExample {

	public static void main(String[] args) {

		// subString ���ڿ��� �߶󳻴� �޼���
		String ssn = "880815-1234567";

		// subString �Ʒ��� ���� �����ε��� �Ǿ��ִ�.
		System.out.println(ssn.substring(7));
		// subString(a,b) ó���ε����� ���������� ������ �ε����� ���� ���� �ʴ� ��.
		System.out.println(ssn.substring(0, 6));

	}

}
