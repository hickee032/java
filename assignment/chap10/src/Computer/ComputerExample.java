package Computer;

import java.util.Scanner;

public class ComputerExample {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Computer com = new Computer();

		System.out.print("���ϰ����ϴ� ���� �������� �Է��ϼ��� : ");

		double radius = scan.nextDouble();

		com.areaCircle(radius);

		scan.close();

	}

}
