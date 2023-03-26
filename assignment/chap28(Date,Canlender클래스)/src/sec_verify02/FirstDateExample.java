package sec_verify02;

import java.util.Calendar;

public class FirstDateExample {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		   printCalendar("현재 ", now);

		   Calendar firstDate = Calendar.getInstance();
		   firstDate.clear();
		   firstDate.set(2012, 11, 25); // 2012년 12월 25일. 12월을 표현하기 위해 month에 11로 설정
		   firstDate.set(Calendar.HOUR_OF_DAY, 20); // 저녁 8시
		   firstDate.set(Calendar.MINUTE, 30); // 30분
		   printCalendar("처음 데이트한 날은 ", firstDate);
		

	}
	private static void printCalendar(String a, Calendar c) {
		 
		int week    = c.get(Calendar.DAY_OF_WEEK);      
	      String strWeek = "";
	      
	      switch(week) 
	      {
	         case Calendar.MONDAY:
	            strWeek = "월";
	            break;
	         case Calendar.TUESDAY:
	            strWeek = "화";
	            break;
	         case Calendar.WEDNESDAY:
	            strWeek = "수";
	            break;
	         case Calendar.THURSDAY:
	            strWeek = "목";
	            break;
	         case Calendar.FRIDAY:
	            strWeek = "금";
	            break;
	         case Calendar.SATURDAY:
	            strWeek = "토";
	            break;
	         default:
	            strWeek = "일";
	      }
	      int APm    = c.get(Calendar.AM_PM); 
	      String strm = "";
	      if(APm==0) {
	    	  strm = "오전";
	      }
	      else {
	    	  strm = "오후";
	      }
	      
	      System.out.println(a + c.get(Calendar.YEAR)+"/ "+c.get(Calendar.MONTH)+"/ "+c.get(Calendar.DATE)
				+strWeek+"요일 "+strm+" "+c.get(Calendar.HOUR)+"시 "+c.get(Calendar.MINUTE)+"분 "+c.get(Calendar.SECOND)+"초 "+c.get(Calendar.MILLISECOND)+"밀리초");
		return;
				//a + c.get(Calendar.YEAR)+"/"+c.get(Calendar.MONTH)+"/"+c.get(Calendar.DATE)
				//+strWeek+strm+c.get(Calendar.HOUR_OF_DAY)+c.get(Calendar.MINUTE)+c.get(Calendar.SECOND);
		
	}
	

}
