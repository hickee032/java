package Printer;

//자손

public class LaserPrinter extends Printer {

	static final int amountOfTonerToPrint = 10;

	private int amountOfToner;

	public LaserPrinter(String modelName, String manufacturer, int numberOfPrinted, int numberOfPaper,

			int amountOfToner) {

		super(modelName, manufacturer, numberOfPrinted, numberOfPaper);

		this.amountOfToner = amountOfToner;

	}

	// getter

	public int getAmountOfToner() {

		return amountOfToner;

	}

	@Override

	public boolean print() {

		if (amountOfTonerToPrint > this.amountOfToner) {

			System.out.println("토너가 부족합니다.");

			System.out.println("제조사 : " + super.getManufacturer());

			System.out.println("모델명 : " + super.getModelName());

			System.out.print("레이저프린터>>");

			System.out.print("인쇄용지: " + this.numberOfPaper);

			System.out.print(" 출력매수: " + this.numberOfPrinted);

			System.out.println(" 토너잔량: " + this.amountOfToner);

			System.out.println();

			return false;

		}

		else {

			System.out.println("레이저 프린터 출력");

			System.out.println("제조사 : " + super.getManufacturer());

			System.out.println("모델명 : " + super.getModelName());

			System.out.print("레이저프린터>>");

			System.out.print("인쇄용지: " + (--this.numberOfPaper));

			System.out.print(" 출력매수: " + (++this.numberOfPrinted));

			this.amountOfToner = this.amountOfToner - amountOfTonerToPrint;

			System.out.println(" 토너잔량: " + this.amountOfToner);

			System.out.println();

			return true;

		}

	}

}