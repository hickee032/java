package sec_verify09;

public class StringCountExample {

	static int count(String src, String target) {

		String[] arr = src.split("��|��.|!");

		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			//System.out.println(arr[i]);
			if (target.equals(arr[i])) {
				count++;
			}
		}
		return count;

	}

	public static void main(String[] args) {

		String str1 = "�뱸��  ����սô�.�뱸!";
		String str2 = "I like LG, I like Pizza!";

		System.out.println(str1 + " <-- ���ڿ����� �뱸��� �ܾ �� "+count(str1, "�뱸") +"�� �־��.");
		System.out.println(str2 + " <-- ���ڿ����� �뱸��� �ܾ �� "+count(str2, "�뱸") +"�� �־��.");

	}

}
