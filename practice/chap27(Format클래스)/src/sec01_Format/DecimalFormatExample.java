package sec01_Format;

import java.text.DecimalFormat;

public class DecimalFormatExample {

	public static void main(String[] args) {
		
		double num = 1234567.89;
		
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.0");
		System.out.println(df.format(num));
		//0���� format�� �ѱ�� �ڸ��� �Դ� ��.
		df = new DecimalFormat("000000000.0000");
		System.out.println(df.format(num));

		df = new DecimalFormat("#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.#");
		System.out.println(df.format(num));
		
		//#���� format�� ������ �ڸ��� �������� �ʴ´�.
		df = new DecimalFormat("##########.####");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("##########.00");
		System.out.println(df.format(num));
		
	}

}
