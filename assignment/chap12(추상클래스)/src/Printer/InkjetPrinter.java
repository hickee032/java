package Printer;

//자손

public class InkjetPrinter extends Printer {

	static final int amountOfInkToPrint = 5;

	private int amountOfInk;

	public InkjetPrinter(String modelName, String manufacturer, int numberOfPrinted, int numberOfPaper,

			int amountOfInk) {

		super(modelName, manufacturer, numberOfPrinted, numberOfPaper);

		this.amountOfInk = amountOfInk;

	}

	// getter

	public int getAmountOfInk() {

		return amountOfInk;

	}

	@Override

	public boolean print() {

		if (amountOfInkToPrint > amountOfInk) {

			System.out.println("잉크가 부족합니다.");

			System.out.println("제조사 : " + super.getManufacturer());

			System.out.println("모델명 : " + super.getModelName());

			System.out.print("잉크젯 프린터>>");

			System.out.print("인쇄용지: " + this.numberOfPaper);

			System.out.print(" 출력매수: " + this.numberOfPrinted);

			System.out.println(" 잉크잔량: " + this.amountOfInk);

			System.out.println();

			return false;

		}

		else {

			System.out.println("잉크젯 프린터 출력");

			System.out.println("제조사 : " + super.getManufacturer());

			System.out.println("모델명 : " + super.getModelName());

			System.out.print("잉크젯 프린터>>");

			System.out.print("인쇄용지: " + (--this.numberOfPaper));

			System.out.print(" 출력매수: " + (++this.numberOfPrinted));

			this.amountOfInk = this.amountOfInk - amountOfInkToPrint;

			System.out.println(" 잉크잔량: " + this.amountOfInk);

			System.out.println();

			return true;

		}

	}

}