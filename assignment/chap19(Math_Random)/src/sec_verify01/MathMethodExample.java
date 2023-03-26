package sec_verify01;

public class MathMethodExample {

	public static void main(String[] args) {
		double number = -2.78987434;

		double numabs = Math.abs(number);
		System.out.println("number의 절대값 : " + numabs);

		double numceil = Math.ceil(number);
		System.out.println("number의 올림값 : " + numceil);

		double numfloor = Math.floor(number);
		System.out.println("number의 내림값 : " + numfloor);

		double PIrint = Math.rint(3.14);
		System.out.println("PI의 가까운 정수 : " + PIrint);

		double doubletwo = Math.sqrt(9.0);
		System.out.println("9.0 의 제곱근 : " + doubletwo);

		// 0-0.99
		System.out.print("이번주 행운의 로또 번호는");
		for (int i = 0; i < 6; i++) {
			int lottonum = (int) (Math.random() * 50 + 1);
			System.out.print(" " + lottonum + ",");
		}
		System.out.println("입니다.");

	}

}
