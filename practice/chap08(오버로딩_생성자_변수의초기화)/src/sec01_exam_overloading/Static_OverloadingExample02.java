package sec01_exam_overloading;

public class Static_OverloadingExample02 {

	public static void main(String[] args) {

		// 스테틱은 스테틱만 호출
		int result = add(3, 5);
		System.out.println(result);

		int[] result2 = { 0 }; // 배열 생성 result2 0으로 초기화
		add(3, 5, result2); // add 메서드에 (3,5,result2) 를 매개변수로 던진다.
		System.out.println(result2[0]);

	}

	// 스테틱 메서드 오버로딩
	public static int add(int a, int b) {
		return a + b;

	}

	// 배열명은 주소값
	public static void add(int a, int b, int[] result) {
		result[0] = a + b;
	}// 매개 변수로 전달 받은 a+b의 값을 result배열의 결과 값에 저장.

}
