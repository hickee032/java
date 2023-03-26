package Printer;

//�ڼ�

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

			System.out.println("��ũ�� �����մϴ�.");

			System.out.println("������ : " + super.getManufacturer());

			System.out.println("�𵨸� : " + super.getModelName());

			System.out.print("��ũ�� ������>>");

			System.out.print("�μ����: " + this.numberOfPaper);

			System.out.print(" ��¸ż�: " + this.numberOfPrinted);

			System.out.println(" ��ũ�ܷ�: " + this.amountOfInk);

			System.out.println();

			return false;

		}

		else {

			System.out.println("��ũ�� ������ ���");

			System.out.println("������ : " + super.getManufacturer());

			System.out.println("�𵨸� : " + super.getModelName());

			System.out.print("��ũ�� ������>>");

			System.out.print("�μ����: " + (--this.numberOfPaper));

			System.out.print(" ��¸ż�: " + (++this.numberOfPrinted));

			this.amountOfInk = this.amountOfInk - amountOfInkToPrint;

			System.out.println(" ��ũ�ܷ�: " + this.amountOfInk);

			System.out.println();

			return true;

		}

	}

}