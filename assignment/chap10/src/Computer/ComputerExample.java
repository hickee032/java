package Computer;

import java.util.Scanner;

public class ComputerExample {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Computer com = new Computer();

		System.out.print("구하고자하는 원의 반지름을 입력하세요 : ");

		double radius = scan.nextDouble();

		com.areaCircle(radius);

		scan.close();

	}

}
