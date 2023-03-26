package sec_verify09;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx {

	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5;

	public static void save(String input) {

		if (input.equals("help")) {
			System.out.println(
					"help - ������ �����ݴϴ�.\r\n" + "q �Ǵ� Q - ���α׷��� �����մϴ�.\r\n" + "history - �ֱٿ� �Է��� ��ɾ 5�� �����ݴϴ�.");
		} else if ((input.equals("q")) || (input.equals("Q"))) {
			System.out.println("���α׷��� �����մϴ�.");
			System.exit(0);
		} else if (input.equals("history")) {
			while(!q.isEmpty()) {
				System.out.println(q.poll());
			}
		} else {
			q.offer(input);

		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("help�� �Է��ϸ� ������ �� �� �ֽ��ϴ�.");
		for (int i = 0; i < 10; i++) {
			String input = sc.nextLine();
			save(input);
		}

	}

}
