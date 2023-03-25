package sec02_Canlender;

import java.util.Calendar;

public class CanlenderExample04 {

	public static void main(String[] args) {

		Calendar date = Calendar.getInstance();

		date.set(2016, 10, 15); // 2016 11 1
		System.out.println(toString(date));
		System.out.println("----1일 후 ----");

		//Calendar클래스는 add()는 date값에 변화에 따라 월 년도 까지 영향을 끼친다.
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));

		//Calendar클래스는 roll()는 date값에 변화하더라도 월 년도 까지 영향을 미치지 않는다.
		System.out.println("----25일후----");
		date.roll(Calendar.DATE, 25);
		System.out.println(toString(date));

	}

	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 " + date.get(Calendar.DATE) + "일";
	}

}
