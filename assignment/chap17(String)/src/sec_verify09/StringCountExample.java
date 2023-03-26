package sec_verify09;

public class StringCountExample {

	static int count(String src, String target) {

		String[] arr = src.split("를|다.|!");

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

		String str1 = "대구를  사랑합시다.대구!";
		String str2 = "I like LG, I like Pizza!";

		System.out.println(str1 + " <-- 문자열에는 대구라는 단어가 총 "+count(str1, "대구") +"번 있어요.");
		System.out.println(str2 + " <-- 문자열에는 대구라는 단어가 총 "+count(str2, "대구") +"번 있어요.");

	}

}
