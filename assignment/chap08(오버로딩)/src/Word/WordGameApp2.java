package Word;

import java.util.Scanner;

public class WordGameApp2 {

	private Scanner scanner;
    private String startWord = "아버지";
    private Player[] players;
    
    WordGameApp2() {
       this.scanner = new Scanner(System.in);
    }
    
    //참가하는 인원과 이름을 입력받음.
    public void createPlayers() {
       System.out.print("참가하는 인원은 몇명입니까>>");
       int num = scanner.nextInt();
       this.players = new Player[num];
       //멤버변수인 players에 사용자로부터 입력받은 인원만큼 방을 생성.
       
       for (int i=0; i<this.players.length; i++) {
          System.out.print("참가자의 이름을 입력하세요>>");
          String name = scanner.next();
          //참가자의 이름을 입력받는 부분
          
          players[i] = new Player(name);
          //play[]에 붙이는 작업을 하고 있는 코드(attach)
          
       }
    }
    
    public void run() {
       //게임에 참가하는 인원과 이름을 받는 메서드를 호출.
       createPlayers();
       System.out.println("시작하는 단어는 " + this.startWord + " 입니다.");
       
       int next = 0; //참가자들이 순서대로 단어를 말할 수 있도록 하는 인덱스의 역할
       String lastWord = this.startWord;   //비교대상이 되는 첫단어를 저장하는 부분
       
       while(true) {
          //참가자에게 단어를 입력 받는 메서드인 sayWord를 호출
          String newWord = players[next].sayWord();
          
          //next인덱스에 있는 참가자가 성공하였는지 검사하는 부분
          //무한루프에서 빠져나가는 탈출구를 생성
          if(!players[next].succeed(lastWord)) {
             System.out.println(players[next].getName() + "이(가) 졌습니다.");
             break;
          }
          next++; //다음 참가자를 출력하기 위해 증가함.
          next = next % players.length; //next라는 인덱스가 배열의  인덱스 범위 안에서 돌도록 설정.
          lastWord = newWord;   //참가자가 입력한 단어와 비교를 위해 임시저장
       }
       
    }
 }
