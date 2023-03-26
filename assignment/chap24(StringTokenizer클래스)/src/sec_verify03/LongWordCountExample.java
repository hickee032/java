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
		System.out.println("가장 긴 단어를 구하는 프로그램입니다.(종료 : Ctrl+Z) ");
		System.out.println("문자열을 입력하세요(공백은 문자에 미포함)");

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
		System.out.println("가장 긴 단어는 " + vec.get(maxindex));

	}
}
