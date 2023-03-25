package sec02_Canlender;

import java.util.Calendar;
import java.util.TimeZone;

public class PrintTimeZoneID {

	public static void main(String[] args) {

		// 모든 TimeZone의 ID 값을 얻는다.
		String[] timezone = TimeZone.getAvailableIDs();
		int i = 0;
		for (String id : timezone) {
			System.out.println("존 영역 - " + id);
			i++;
		}
		System.out.println("총 ID 개수" + i);

		// TimeZone을 얻어 내고 있다.
		TimeZone tz = TimeZone.getTimeZone("Asia/Seoul");

		Calendar now = Calendar.getInstance(tz);
		System.out.println(toString(now));
	}

	public static String toString(Calendar date) {

		int a = date.get(Calendar.AM_PM);
		String str = "";
		if (a == 0) {
			str = "오전";
		} else {
			str = "오후";
		}
		return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 " + date.get(Calendar.DATE) + "일"
				+ " " + str + " " + date.get(Calendar.HOUR) + "시" + date.get(Calendar.MINUTE) + "분"
				+ date.get(Calendar.SECOND) + "초";

	}
}
