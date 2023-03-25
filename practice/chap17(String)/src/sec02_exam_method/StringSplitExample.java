package sec02_exam_method;

public class StringSplitExample {

	public static void main(String[] args) {

		/* 중요 많이 쓰인다.
		 * split()은 매개변수로 정규 표현식이 온다. 
		 * 하여 정규표현식이 가지고있는 문자열을 분리하여 
		 * String[] 타입으로 리턴한다.
		 *
		 * 정규표현식 : /,&,|, 쉼표 포함 (dog/cat/bird) 
		 */
		
		String str1 = "사랑해,너를/교촌치킨&양념치킨";
		String str2 = "BHC치킨/BBQ치킨/처갓집양념통닭/교촌치킨";
		
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
