package sec02_exam_method;

public class StringGetbatesExample {

	public static void main(String[] args) {

		String str = "�ȳ��ϼ���";

		// ���ڵ�(��谡 ���ϰ� �ϴ� ����)
		//.getBytes()�� ���ڵ��Ҷ� ���δ�.
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1�� ���� : " + bytes1.length);

		// ���ڵ�(����� ���ϵ��� �ϴ� ����)
		
		/* ���ڵ��� ���ڵ��� �����ڵ尡 ���ƾ� ���ڰ� ������ �ʴ� ��.
		 * UTF-8�̸� UTF-8, 
		 * EUC-KR�̸� EUC-KR 
		 * UTF-8�� �����ϵ��� �Ѵ�.
		       ��Ŭ������ EUC-KR�� ����Ʈ ���̴�.*/
		String str1 = new String(bytes1);
		System.out.println("bytes1 �迭 -> ���ڿ� : " + str1);
	}

}
