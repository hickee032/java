package sec_verify03;

import java.util.Scanner;

public class Kawibawibo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		final String str[] = { "����", "����", "��" };

		int userChoice;
		int computerChoice;

		while (true) {
			System.out.print("����(1), ����(2), ��(3), ������(4) �� �ϳ��� �����ϼ���>> ");
			userChoice = scan.nextInt();
			computerChoice = (int) (Math.random() * 3) + 1;
			int a = computerChoice - 1;

			if ((1 <= userChoice) && (userChoice <= 3)) {
				System.out.println(str[a]);
				if ((userChoice == 1) && (computerChoice != 2)) {
					System.out.println("�̱�");
				} else if ((userChoice == 1) && (computerChoice == 2)) {
					System.out.println("����");
				}
				if ((userChoice == 2) && (computerChoice != 3)) {
					System.out.println("�̱�");
				} else if ((userChoice == 1) && (computerChoice == 3)) {
					System.out.println("����");
				}
				if ((userChoice == 3) && (computerChoice != 1)) {
					System.out.println("�̱�");
				} else if ((userChoice == 1) && (computerChoice == 1)) {
					System.out.println("����");
				}

			} else if (userChoice == computerChoice) {
				System.out.println("���");
				continue;
			} else if (userChoice == 4) {
				System.out.println("����");
				System.exit(0);
			} else {
				System.out.println("�ٽ� �Է�");
			}
			scan.close();
		}

	}

}
