package sec01_exam;

public class PrintEx2 {
	
	public static void main(String[] args) {
		
		float f1 =.10f;
		float f2 = 11f;
		float f3 = 3.14f;
		double d1 = 12345.27456789;

		System.out.printf("f1 = %f %n", f1);
		System.out.printf("f2 = %f %n", f2);
		System.out.printf("f3 = %f %n", f3);
		//print()매서드 이용방법은 아래와 같이 응용
		System.out.println();

		System.out.printf("d1 = %f %n", d1);

		System.out.printf("d1 = %.1f %n", d1);
		System.out.printf("[122345678901234567890] %n");
	}
}
