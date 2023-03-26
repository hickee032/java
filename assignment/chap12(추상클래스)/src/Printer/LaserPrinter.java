package Printer;

//�ڼ�

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

			System.out.println("��ʰ� �����մϴ�.");

			System.out.println("������ : " + super.getManufacturer());

			System.out.println("�𵨸� : " + super.getModelName());

			System.out.print("������������>>");

			System.out.print("�μ����: " + this.numberOfPaper);

			System.out.print(" ��¸ż�: " + this.numberOfPrinted);

			System.out.println(" ����ܷ�: " + this.amountOfToner);

			System.out.println();

			return false;

		}

		else {

			System.out.println("������ ������ ���");

			System.out.println("������ : " + super.getManufacturer());

			System.out.println("�𵨸� : " + super.getModelName());

			System.out.print("������������>>");

			System.out.print("�μ����: " + (--this.numberOfPaper));

			System.out.print(" ��¸ż�: " + (++this.numberOfPrinted));

			this.amountOfToner = this.amountOfToner - amountOfTonerToPrint;

			System.out.println(" ����ܷ�: " + this.amountOfToner);

			System.out.println();

			return true;

		}

	}

}