package Calculater;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner sin = new Scanner(System.in);

		System.out.print("두 정수와 연산자>>");
		int firstNum = sin.nextInt();

		int secondNum = sin.nextInt();

		char operator = sin.next().charAt(0);

		switch (operator) {

		case '+':
			Add add = new Add();
			add.setFirstNum(firstNum);
			add.setSecondNum(secondNum);
			add.calculate();
			break;

		case '-':
			Sub sub = new Sub();
			sub.setFirstNum(firstNum);
			sub.setSecondNum(secondNum);
			sub.calculate();
			break;

		case '*':
			Mul mul = new Mul();
			mul.setFirstNum(firstNum);
			mul.setSecondNum(secondNum);
			mul.calculate();
			break;

		case '/':
			Div div = new Div();
			div.setFirstNum(firstNum);
			div.setSecondNum(secondNum);
			div.calculate();
			break;
		}

		sin.close();
	}

}
