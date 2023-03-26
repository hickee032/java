package ColorPoint03;

public class ColorPointExample {

	public static void main(String[] args) {

		ColorPoint CP = new ColorPoint();

		CP.set(3, 4);

		CP.showColorPoint("레드");

		CP.set(10, 50);

		CP.showColorPoint("블루");

		CP.set(20, 17);

		CP.showColorPoint("노랑");

		CP.set(2, 1);

		CP.showColorPoint("그린");

	}

}
