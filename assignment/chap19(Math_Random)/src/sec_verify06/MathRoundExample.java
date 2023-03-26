package sec_verify06;

public class MathRoundExample {

	static double round(double d, int n) {

		double temp1 = d * n;
		double b1 = Math.round(temp1);
		double b2 = b1 / n;
		

		return b2;
	}

	public static void main(String[] args) {

		double dou = 3.17836;

		double d1 = Math.round(dou);
		System.out.print("자바에서 제공하는 Math.round(" + dou + ")를 한 결과 : ");
		System.out.println((int) (d1));
		System.out.println();
		System.out.println("직접 만든 round()를 사용한 결과");
		System.out.println("Math.round()와 Math.pow()를 조합하여 만듭니다.");
		System.out.println();
		double d2 = MathRoundExample.round(dou, 10);
		System.out.println(dou+"를 둘째 자리에서 반올림 한 결과 : "+d2);
		double d3 = MathRoundExample.round(dou, 100);
		System.out.println(dou+"를 세째 자리에서 반올림 한 결과 : "+d3);
		double d4 = MathRoundExample.round(dou, 1000);
		System.out.println(dou+"를 네째 자리에서 반올림 한 결과 : "+d4);
		double d5 = MathRoundExample.round(dou, 10000);
		System.out.println(dou+"를 다섯째 자리에서 반올림 한 결과 : "+d5);

	}

}
