package sec01_Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		// DateŬ������ Ÿ�� ������ ������� ���� ����Ѵ�.
		Date now = new Date();
		
		//DateŬ������ ���������� ����ϸ� ���� ǥ�ؽ� UTC���¸� ��µȴ�.
		System.out.println(now);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� a hh�� mm�� ss��");
		System.out.println(sdf.format(now));

	}

}
