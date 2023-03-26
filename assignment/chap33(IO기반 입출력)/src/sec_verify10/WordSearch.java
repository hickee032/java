package sec_verify10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;
import java.util.regex.Pattern;

public class WordSearch {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		Vector<String> vector = new Vector<String>();
		FileReader fr = new FileReader("D:\\JAVA작업\\Assignment_Chap33(IO기반 입출력)\\src\\sec_verify10\\words.txt");
		BufferedReader br = new BufferedReader(fr);
		String str = "";
		while ((str = br.readLine()) != null) {
			vector.add(str);
		}

		System.out.println(vector.size());
		System.out.println(vector.get(0));
		System.out.println(vector.get(vector.size() - 1));

		while (true) {
			System.out.print("찾는 단어>>");
			String input = sc.nextLine();

			if (!input.equals("exit")) {
				for (int i = 0; i < vector.size(); i++) {
					if (vector.get(i).startsWith(input)) {
						System.out.println(vector.get(i));
					}
				}

			} else if (input.equals("exit")) {
				System.out.println("시스템 종료");
				System.exit(0);
			}

		}
	}
}
