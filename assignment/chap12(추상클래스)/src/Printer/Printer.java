package Printer;

public abstract class Printer {

	static int USB;

	static int PARALLEL;

	private String modelName;

	private String manufacturer;

	private int type; // USB �Ǵ� ���� ������

	protected int numberOfPrinted; // �μ��� ���� �ż� ������ �Ǿ�� �Ѵ�. ++

	protected int numberOfPaper; // ���� ���� �ż�

	public Printer(String modelName, String manufacturer, int numberOfPrinted, int numberOfPaper) {

		this.modelName = modelName;

		this.manufacturer = manufacturer;

		this.numberOfPrinted = numberOfPrinted;

		this.setNumberOfPaper(numberOfPaper);

	}

	public int getNumberOfPaper() {

		return numberOfPaper;

	}

	public void setNumberOfPaper(int numberOfPaper) {

		this.numberOfPaper = numberOfPaper;

	}

	public String getModelName() {

		return modelName;

	}

	public String getManufacturer() {

		return manufacturer;

	}

	public int getType() {

		return type;

	}

	public int getNumberOfPrinted() {

		return numberOfPrinted;

	}

	abstract public boolean print();

}