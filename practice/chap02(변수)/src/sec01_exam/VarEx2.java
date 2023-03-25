package sec01_exam;

public class VarEx2 {

	public static void main(String[] args) {

		float x = 10;
		int y = (int) x;
		int tmp = 0; // 임시변수
					// 버블정렬
		System.out.println("x: " + x + " y: " + y); // 값 바꾸기 tmp = x; x = y; y = tmp;
		System.out.println("x: " + x + " y: " + y);
		System.out.println(y);
	}
}
