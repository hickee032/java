package sec_verify03;

import java.util.Scanner;

public class Kawibawibo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		final String str[] = { "가위", "바위", "보" };

		int userChoice;
		int computerChoice;

		while (true) {
			System.out.print("가위(1), 바위(2), 보(3), 끝내기(4) 중 하나를 선택하세요>> ");
			userChoice = scan.nextInt();
			computerChoice = (int) (Math.random() * 3) + 1;
			int a = computerChoice - 1;

			if ((1 <= userChoice) && (userChoice <= 3)) {
				System.out.println(str[a]);
				if ((userChoice == 1) && (computerChoice != 2)) {
					System.out.println("이김");
				} else if ((userChoice == 1) && (computerChoice == 2)) {
					System.out.println("졌음");
				}
				if ((userChoice == 2) && (computerChoice != 3)) {
					System.out.println("이김");
				} else if ((userChoice == 1) && (computerChoice == 3)) {
					System.out.println("졌음");
				}
				if ((userChoice == 3) && (computerChoice != 1)) {
					System.out.println("이김");
				} else if ((userChoice == 1) && (computerChoice == 1)) {
					System.out.println("졌음");
				}

			} else if (userChoice == computerChoice) {
				System.out.println("비김");
				continue;
			} else if (userChoice == 4) {
				System.out.println("종료");
				System.exit(0);
			} else {
				System.out.println("다시 입력");
			}
			scan.close();
		}

	}

}
