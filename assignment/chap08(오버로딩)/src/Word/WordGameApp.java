package Word;

import java.util.Scanner;

public class WordGameApp {

	private Scanner scanner;

	private Player[] players;

	private String startWord = "아버지";

	public WordGameApp() {

		this.scanner = new Scanner(System.in);

	}

	public void createPlayers() {

		System.out.print("게임에 참가하는 인원은 몇명입니까? >> ");

		int number = scanner.nextInt();

		this.players = new Player[number];

		for (int i = 0; i < number; i++) {
			// (int i = 0 ; i <this.players.lenth ; i++)

			System.out.print("참가자의 이름을 입력하세요 >> ");
			String name = scanner.next();
			// 어태치
			players[i] = new Player(name);

			// players[i].setName(scanner.next());
		}
	}

	public void run() {
		//게임에 참가하는 인원과 이름을 받는 메서드를 호출.
		
		createPlayers();

		System.out.println("시작하는 단어는" + this.startWord + "입니다");
		int next = 0; // 참가자들이 순차적으로 단어를 말할수 있게 해주는 인덱스
		String lastWord = this.startWord; // 비교대상이 되는 첫단어를 저장

		

		while (true) {
			// 참가자에게 단어입력 받는 메세드 sayword호출
			String newWord = players[next].sayWord();
			// next인덱스 사용자가 성공하는 지 검사, 무한루프에서 빠져 나가는 구멍 만드는 코드
			if (!players[next].succeed(lastWord)) {
				System.out.println(players[next].getName() + "졌어");
				break;
			} else {
				next++;// 다음 참가자 출력하기위해 증가
				
				//배열의 범위 내에서 놀게하기 위한것. 인덱스의 범위를 배열의 인덱스 범위로 한정하는 코드 .
				//ex) next =4 라면 4%3 은 1 3%3은 0 next의 범위는 0,1,2로 한정한다.
				next = next % players.length;
				lastWord = newWord; //참가자가 입력한 단어를 비교위해 임시저장.
			}		
		}
	}

	public void setStartWord(String startWord) {
		this.startWord = startWord;
	}

	public String getStartWord() {
		return startWord;
	}

}
