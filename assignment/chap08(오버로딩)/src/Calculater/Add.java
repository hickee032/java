package Calculater;

public class Add {

	private int firstNum;
	private int secondNum;

	public void setValue(int firstNum, int secondNum) {

		this.calculate();

	}

	public int calculate() {

		int result = getFirstNum() + getSecondNum();
		System.out.println(result);
		return result;
	}

	public int getFirstNum() {
		return firstNum;
	}

	public int getSecondNum() {
		return secondNum;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

}
