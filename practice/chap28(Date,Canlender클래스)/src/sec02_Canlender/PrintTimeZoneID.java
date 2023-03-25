package sec02_Canlender;

import java.util.Calendar;
import java.util.TimeZone;

public class PrintTimeZoneID {

	public static void main(String[] args) {

		// ��� TimeZone�� ID ���� ��´�.
		String[] timezone = TimeZone.getAvailableIDs();
		int i = 0;
		for (String id : timezone) {
			System.out.println("�� ���� - " + id);
			i++;
		}
		System.out.println("�� ID ����" + i);

		// TimeZone�� ��� ���� �ִ�.
		TimeZone tz = TimeZone.getTimeZone("Asia/Seoul");

		Calendar now = Calendar.getInstance(tz);
		System.out.println(toString(now));
	}

	public static String toString(Calendar date) {

		int a = date.get(Calendar.AM_PM);
		String str = "";
		if (a == 0) {
			str = "����";
		} else {
			str = "����";
		}
		return date.get(Calendar.YEAR) + "�� " + (date.get(Calendar.MONTH) + 1) + "�� " + date.get(Calendar.DATE) + "��"
				+ " " + str + " " + date.get(Calendar.HOUR) + "��" + date.get(Calendar.MINUTE) + "��"
				+ date.get(Calendar.SECOND) + "��";

	}
}
