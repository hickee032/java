package Assignment05_MyExp;

public class MyExpExample {

	public static void main(String[] args) {

		MyExp myexp = new MyExp();

		// base 값 , 초기화

		myexp.base = 2;

		myexp.exp = 3;

		System.out.print(myexp.base + "의 ");

		System.out.print(myexp.exp + "승 = ");

		int result = myexp.getValue(); // 연산 결과를 result로 처리한다.

		System.out.println(result);

		myexp.base = 3;

		myexp.exp = 4;

		System.out.print(myexp.base + "의 ");

		System.out.print(myexp.exp + "승 = ");

		result = myexp.getValue();

		System.out.print(result);

	}

}
