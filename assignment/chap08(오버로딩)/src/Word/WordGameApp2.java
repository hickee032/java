package Word;

import java.util.Scanner;

public class WordGameApp2 {

	private Scanner scanner;
    private String startWord = "�ƹ���";
    private Player[] players;
    
    WordGameApp2() {
       this.scanner = new Scanner(System.in);
    }
    
    //�����ϴ� �ο��� �̸��� �Է¹���.
    public void createPlayers() {
       System.out.print("�����ϴ� �ο��� ����Դϱ�>>");
       int num = scanner.nextInt();
       this.players = new Player[num];
       //��������� players�� ����ڷκ��� �Է¹��� �ο���ŭ ���� ����.
       
       for (int i=0; i<this.players.length; i++) {
          System.out.print("�������� �̸��� �Է��ϼ���>>");
          String name = scanner.next();
          //�������� �̸��� �Է¹޴� �κ�
          
          players[i] = new Player(name);
          //play[]�� ���̴� �۾��� �ϰ� �ִ� �ڵ�(attach)
          
       }
    }
    
    public void run() {
       //���ӿ� �����ϴ� �ο��� �̸��� �޴� �޼��带 ȣ��.
       createPlayers();
       System.out.println("�����ϴ� �ܾ�� " + this.startWord + " �Դϴ�.");
       
       int next = 0; //�����ڵ��� ������� �ܾ ���� �� �ֵ��� �ϴ� �ε����� ����
       String lastWord = this.startWord;   //�񱳴���� �Ǵ� ù�ܾ �����ϴ� �κ�
       
       while(true) {
          //�����ڿ��� �ܾ �Է� �޴� �޼����� sayWord�� ȣ��
          String newWord = players[next].sayWord();
          
          //next�ε����� �ִ� �����ڰ� �����Ͽ����� �˻��ϴ� �κ�
          //���ѷ������� ���������� Ż�ⱸ�� ����
          if(!players[next].succeed(lastWord)) {
             System.out.println(players[next].getName() + "��(��) �����ϴ�.");
             break;
          }
          next++; //���� �����ڸ� ����ϱ� ���� ������.
          next = next % players.length; //next��� �ε����� �迭��  �ε��� ���� �ȿ��� ������ ����.
          lastWord = newWord;   //�����ڰ� �Է��� �ܾ�� �񱳸� ���� �ӽ�����
       }
       
    }
 }
