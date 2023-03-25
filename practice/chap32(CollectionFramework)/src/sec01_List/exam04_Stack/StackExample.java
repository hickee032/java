package sec01_List.exam04_Stack;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// Coin을 저장하는 Stack컬렉션을 생성
		Stack<Coin> coinBox = new Stack<Coin>();
		//coinBox에 저장하는 메서드
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(90));
		coinBox.push(new Coin(120));
		coinBox.push(new Coin(10));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(1));
		
		while(!coinBox.isEmpty()) {
			//제일 늦게 들어간 동전을 하나씩 뺀다.
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 - "+coin.getValue());
			//stack 클래스 pop()을 하게 되면 저장소에서 사라짐을 확인 할수 있다.
			System.out.println("저장된 동전 수 - "+coinBox.size());
		}

	}

}
