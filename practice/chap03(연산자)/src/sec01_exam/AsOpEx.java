package sec01_exam;

public class AsOpEx {

	public static void main(String[] args) {

		int result = 0;
		//복합대입 연산자는 값을 누적시킬때 많이 사용된다.
		result += 10;
		System.out.println("result=" + result);
		result -= 5;
		System.out.println("result=" + result);
		result *= 3;
		System.out.println("result=" + result);
		result /= 5;
		System.out.println("result=" + result);
		result %= 3;
		System.out.println("result=" + result);
	}
}
