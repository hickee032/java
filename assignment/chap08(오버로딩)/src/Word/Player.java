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
							//�̸�

		this.word = scanner.next(); //�ܾ� �Է�
		return word;
		//string ����

	}
	//��
	public boolean succeed(String lastWord) {
			//true,false�� �����Ѵ�. boolean;
		int lastIndex = lastWord.length() - 1;// index 0,1,2
						//length�� 3�̴ϱ� �ε��� �� length-1�� �ȴ�.
		if (lastWord.charAt(lastIndex) == this.word.charAt(0)) {
							//length-1�� ��.
			return true;
		} else {
			return false;
		}
	}

	public void setName(String name) {

		this.name = name;

	}

}
