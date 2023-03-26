package Assignment02_Computer;

import java.util.Scanner;

public class ComputerExample {

	public static void main(String[] args) {

		int input = 0;

		int arr_input = 0;

		Scanner scan = new Scanner(System.in);

		Computer Com = new Computer();

		System.out.print("1차원 배열을 만듭니다.배열수를 입력: ");

		input = scan.nextInt();

		int[] values = new int[input];

		System.out.println("해당 배열 방에 정수를 입력하세요.");

		for (int i = 0; i < values.length; i++) {

			System.out.print("value[" + i + "] = ");

			arr_input = scan.nextInt();

			values[i] = arr_input;

		}

		System.out.println("입력하신 1차원 배열의 값을 출력합니다.");

		for (int i = 0; i < values.length; i++) {

			System.out.println("value[" + i + "] = " + values[i]);

		}

		int result = Com.sum(values);

		System.out.println(result);

		scan.close();
	}

}