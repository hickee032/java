package sec01_List.exam04_Stack;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// Coin�� �����ϴ� Stack�÷����� ����
		Stack<Coin> coinBox = new Stack<Coin>();
		//coinBox�� �����ϴ� �޼���
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(90));
		coinBox.push(new Coin(120));
		coinBox.push(new Coin(10));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(1));
		
		while(!coinBox.isEmpty()) {
			//���� �ʰ� �� ������ �ϳ��� ����.
			Coin coin = coinBox.pop();
			System.out.println("������ ���� - "+coin.getValue());
			//stack Ŭ���� pop()�� �ϰ� �Ǹ� ����ҿ��� ������� Ȯ�� �Ҽ� �ִ�.
			System.out.println("����� ���� �� - "+coinBox.size());
		}

	}

}
