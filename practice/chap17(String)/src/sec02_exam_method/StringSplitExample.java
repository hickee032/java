package sec02_exam_method;

public class StringSplitExample {

	public static void main(String[] args) {

		/* �߿� ���� ���δ�.
		 * split()�� �Ű������� ���� ǥ������ �´�. 
		 * �Ͽ� ����ǥ������ �������ִ� ���ڿ��� �и��Ͽ� 
		 * String[] Ÿ������ �����Ѵ�.
		 *
		 * ����ǥ���� : /,&,|, ��ǥ ���� (dog/cat/bird) 
		 */
		
		String str1 = "�����,�ʸ�/����ġŲ&���ġŲ";
		String str2 = "BHCġŲ/BBQġŲ/ó����������/����ġŲ";
		
		String [] arr = str1.split(",|/|&");
		String [] arr1 = str2.split("/");
		
		for(String str:arr) {
			System.out.println(str);
		}
		
		System.out.println();
		
		for(String str:arr1) {
			System.out.println(str);
		}

	}

}
