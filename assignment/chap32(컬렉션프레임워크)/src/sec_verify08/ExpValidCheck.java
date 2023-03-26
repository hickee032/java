package sec_verify08;

import java.util.Stack;

public class ExpValidCheck {

	@SuppressWarnings("rawtypes")
	public static Stack st = new Stack();

	public static String expression1 = "( (2*7) + 3 - 1)";
	public static String expression2 = "( (2*7) + 3 - 1";

	public static void ExpressionCheck(String expression) {
		int countF = 0;
		int countE = 0;
		for (int i = 0; i < expression.length(); i++) {
			if (expression.charAt(i) == '(') {
				countF++;
			}
			if (expression.charAt(i) == ')') {
				countE++;
			}
		}
		if (countE != countF) {
			System.out.println("괄호가 일치하지 않습니다.");
			
		} else if (countE == countF) {
			System.out.println("괄호가 일치합니다.");
		}
	}

	public static void main(String[] args) {
	
		System.out.println(expression1);
		ExpressionCheck(expression1);
		
		System.out.println(expression2);
		ExpressionCheck(expression2);

	}

}
