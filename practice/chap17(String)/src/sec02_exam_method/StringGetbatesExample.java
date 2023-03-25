package sec02_exam_method;

public class StringGetbatesExample {

	public static void main(String[] args) {

		String str = "안녕하세요";

		// 인코딩(기계가 편하게 하는 과정)
		//.getBytes()은 인코딩할때 쓰인다.
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1의 길이 : " + bytes1.length);

		// 디코딩(사람이 편하도록 하는 과정)
		
		/* 인코딩과 디코딩의 문자코드가 같아야 문자가 깨지지 않는 다.
		 * UTF-8이면 UTF-8, 
		 * EUC-KR이면 EUC-KR 
		 * UTF-8로 통일하도록 한다.
		       이클립스는 EUC-KR이 디폴트 값이다.*/
		String str1 = new String(bytes1);
		System.out.println("bytes1 배열 -> 문자열 : " + str1);
	}

}
