package Assignment05;

import java.util.Scanner;

public class PowerExample {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("제곱까지의 합을 계산합니다.");

		System.out.print("제곱하고 싶은 수를 입력 : ");

		int x = scan.nextInt();

		System.out.print("몇승을 할까요? : ");

		int y = scan.nextInt();

		long result = PowerExample.power(x, y);

		System.out.println(x + "의 " + y + "승 까지의 합계는 " + result);

		scan.close();
	}

	public static long power(int x, int n) {
		long result = 1;
		long sum = 0;

		for (int i = 0; i <= n - 1; i++) {
			result *= x;

			sum += result;
			// System.out.println(result);
		}
		// System.out.println(sum);
		return sum;
	}

}
//x*x