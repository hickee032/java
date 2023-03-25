package sec02_Canlender;

import java.util.Calendar;

public class CanlenderExample04 {

	public static void main(String[] args) {

		Calendar date = Calendar.getInstance();

		date.set(2016, 10, 15); // 2016 11 1
		System.out.println(toString(date));
		System.out.println("----1�� �� ----");

		//CalendarŬ������ add()�� date���� ��ȭ�� ���� �� �⵵ ���� ������ ��ģ��.
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));

		//CalendarŬ������ roll()�� date���� ��ȭ�ϴ��� �� �⵵ ���� ������ ��ġ�� �ʴ´�.
		System.out.println("----25����----");
		date.roll(Calendar.DATE, 25);
		System.out.println(toString(date));

	}

	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "�� " + (date.get(Calendar.MONTH) + 1) + "�� " + date.get(Calendar.DATE) + "��";
	}

}
