package sec_verify03;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Vector;

public class LongWordCountExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Vector<String> vec = new Vector<String>();
		int maxword = 0;
		int maxindex = 0;
		System.out.println("���� �� �ܾ ���ϴ� ���α׷��Դϴ�.(���� : Ctrl+Z) ");
		System.out.println("���ڿ��� �Է��ϼ���(������ ���ڿ� ������)");

		try {
			while (true) {

				String input = sc.nextLine();

				vec.add(input);
			}
		} catch (NoSuchElementException e) {

			for (int i = 0; i < vec.size(); i++) {
				if (vec.get(i).length() > maxword) {
					maxword = vec.get(i).length();
					maxindex = i;
				}
			}
			sc.close();
			System.exit(0);

		}
		System.out.println("���� �� �ܾ�� " + vec.get(maxindex));

	}
}
