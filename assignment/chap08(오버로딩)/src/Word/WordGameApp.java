package Word;

import java.util.Scanner;

public class WordGameApp {

	private Scanner scanner;

	private Player[] players;

	private String startWord = "�ƹ���";

	public WordGameApp() {

		this.scanner = new Scanner(System.in);

	}

	public void createPlayers() {

		System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ�? >> ");

		int number = scanner.nextInt();

		this.players = new Player[number];

		for (int i = 0; i < number; i++) {
			// (int i = 0 ; i <this.players.lenth ; i++)

			System.out.print("�������� �̸��� �Է��ϼ��� >> ");
			String name = scanner.next();
			// ����ġ
			players[i] = new Player(name);

			// players[i].setName(scanner.next());
		}
	}

	public void run() {
		//���ӿ� �����ϴ� �ο��� �̸��� �޴� �޼��带 ȣ��.
		
		createPlayers();

		System.out.println("�����ϴ� �ܾ��" + this.startWord + "�Դϴ�");
		int next = 0; // �����ڵ��� ���������� �ܾ ���Ҽ� �ְ� ���ִ� �ε���
		String lastWord = this.startWord; // �񱳴���� �Ǵ� ù�ܾ ����

		

		while (true) {
			// �����ڿ��� �ܾ��Է� �޴� �޼��� saywordȣ��
			String newWord = players[next].sayWord();
			// next�ε��� ����ڰ� �����ϴ� �� �˻�, ���ѷ������� ���� ������ ���� ����� �ڵ�
			if (!players[next].succeed(lastWord)) {
				System.out.println(players[next].getName() + "����");
				break;
			} else {
				next++;// ���� ������ ����ϱ����� ����
				
				//�迭�� ���� ������ ����ϱ� ���Ѱ�. �ε����� ������ �迭�� �ε��� ������ �����ϴ� �ڵ� .
				//ex) next =4 ��� 4%3 �� 1 3%3�� 0 next�� ������ 0,1,2�� �����Ѵ�.
				next = next % players.length;
				lastWord = newWord; //�����ڰ� �Է��� �ܾ ������ �ӽ�����.
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
