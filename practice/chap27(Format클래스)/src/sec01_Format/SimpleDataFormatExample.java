package sec01_Format;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDataFormatExample {

	public static void main(String[] args) {

		Date now = new Date();
		
		System.out.println(now);
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd : hh : mm : ss ");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy�� MM�� dd�� a hh : mm : ss");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("������ E����");
		System.out.println(sdf.format(now));
		
		//format�߿� D�� ���ظ� �������� ���° ������ �˾Ƴ��� ��
		sdf = new SimpleDateFormat("������ D���� ��");
		System.out.println(sdf.format(now));
		
		//format�߿� D�� �̹����� �������� ���° ������ �˾Ƴ��� ��
		sdf = new SimpleDateFormat("�̴��� d���� ��");
		System.out.println(sdf.format(now));

	}

}
