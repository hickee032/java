package Computer;

public class Computer extends Calculator {

	public Computer() {

	}

	public double areaCircle(double r) {

		super.areaCircle(r);

		double result = (r * r) * Math.PI; // java docs Math.PI검색후 사용

		System.out.println();
		System.out.println("Computer 객체의 areaCircle() 실행");
		System.out.println("원면적은 : " + result);

		return result;
	}

}
