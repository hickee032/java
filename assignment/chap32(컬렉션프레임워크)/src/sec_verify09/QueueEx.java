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
					"help - 도움말을 보여줍니다.\r\n" + "q 또는 Q - 프로그램을 종료합니다.\r\n" + "history - 최근에 입력한 명령어를 5개 보여줍니다.");
		} else if ((input.equals("q")) || (input.equals("Q"))) {
			System.out.println("프로그램을 종료합니다.");
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
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		for (int i = 0; i < 10; i++) {
			String input = sc.nextLine();
			save(input);
		}

	}

}
