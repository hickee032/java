package sec_verify01;

import java.text.DecimalFormat;

public class MoneyExample {

	public static void main(String[] args) {
		String data = "123,456,789.5"; //"123456789.5"
		System.out.println("data :"+data);
		data = data.replace(",", "");
		double a = Double.parseDouble(data);
		
		DecimalFormat df = new DecimalFormat("#########");
		System.out.println("�ݿø� ��� : "+df.format(a));
		
		df= new DecimalFormat("####,####");
		System.out.println("������ , �߰� : "+df.format(a));
		

	}

}
