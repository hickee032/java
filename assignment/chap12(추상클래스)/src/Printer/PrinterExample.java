package Printer;

public class PrinterExample {

	public static void main(String[] args) {

		Printer ip = new InkjetPrinter("HP", "Officejet V40", 0, 5, 20);

		Printer lp = new LaserPrinter("»ï¼ºÀüÀÚ", "SCX-6x45", 0, 3, 10);

		for (int i = 0; i < 4; i++) {

			lp.print();

			ip.print();

		}

	}

}