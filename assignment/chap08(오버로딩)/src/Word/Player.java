package Word;

import java.util.Scanner;

public class Player {

	private Scanner scanner;
	private String name;
	private String word;

	public Player(String name) {

		this.name = name;

		Scanner scanner = new Scanner(System.in);
	}

	public String getName() {

		return this.name;

	}

	public String sayWord() {

		System.out.print(this.name + ">>");
							//이름

		this.word = scanner.next(); //단어 입력
		return word;
		//string 리턴

	}
	//비교
	public boolean succeed(String lastWord) {
			//true,false를 리턴한다. boolean;
		int lastIndex = lastWord.length() - 1;// index 0,1,2
						//length는 3이니까 인덱스 는 length-1이 된다.
		if (lastWord.charAt(lastIndex) == this.word.charAt(0)) {
							//length-1의 값.
			return true;
		} else {
			return false;
		}
	}

	public void setName(String name) {

		this.name = name;

	}

}
