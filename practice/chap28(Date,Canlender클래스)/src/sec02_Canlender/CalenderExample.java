package sec02_Canlender;

import java.util.Calendar;

public class CalenderExample {

	public static void main(String[] args) {
		//기본적으로 현재날짜와 시간으로 설정
		//싱글톤 패턴이다.
		 Calendar today = Calendar.getInstance();

		 System.out.println("올해의 년도  - "+today.get(Calendar.YEAR));
		 System.out.println("월(0~11리턴 0:1월 +1을 해줘야 함) - "+(today.get(Calendar.MONTH)+1));
		 System.out.println("올해의 몇째 주 - "+today.get(Calendar.WEEK_OF_YEAR));
		 System.out.println("이달의 몇째 주 - "+today.get(Calendar.WEEK_OF_MONTH));
		 
		 System.out.println("이달의 몇일 - "+today.get(Calendar.DAY_OF_MONTH));
		 System.out.println("올해의 몇일 - "+today.get(Calendar.DAY_OF_YEAR));
		 
		 //1일요일 2월요일 ...7토요일
		 System.out.println("요일 1~7리턴"+today.get(Calendar.DAY_OF_WEEK));
		 System.out.println("이달의 몇째요일"+today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		 
		 System.out.println("오전 오후 0오전 1오후 - "+today.get(Calendar.AM_PM));
		 System.out.println("시간 0~11 - "+today.get(Calendar.HOUR));
		 System.out.println("시간 0~23 - "+today.get(Calendar.HOUR_OF_DAY));
		 System.out.println("분 0~59 - "+today.get(Calendar.MINUTE));
		 System.out.println("초 0~59 - "+today.get(Calendar.SECOND));
		 System.out.println("1000분의 1초 0~999 - "+today.get(Calendar.MILLISECOND));
		 
		// 이달의  마지막일을 찾는 다.
		 System.out.println("이달의 마지막 날  - "+today.getActualMaximum(Calendar.DATE));
		 
	}

}
