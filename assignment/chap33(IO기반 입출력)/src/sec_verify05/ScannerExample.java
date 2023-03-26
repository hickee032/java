package sec_verify05;

import java.io.File;
import java.util.Scanner;

public class ScannerExample {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		Score score = new Score();
		Scanner sc = new Scanner(new File("scoreData.txt"));

		// split, tokenizer »ç¿ëÇØºÁ¶ó.
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			Scanner sc2 = new Scanner(line).useDelimiter(",");
			score.add(sc2.next(), sc2.next(), sc2.nextInt(), sc2.nextInt(), sc2.nextInt());
		}
		score.displayList();
		sc.close();
	}

}
